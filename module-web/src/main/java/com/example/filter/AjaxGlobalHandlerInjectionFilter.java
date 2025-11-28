package com.example.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AjaxGlobalHandlerInjectionFilter implements Filter {

    private String redirectOnSessionExpired;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        redirectOnSessionExpired = loadJavaScript(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        // Skip JSF resource requests
        String uri = req.getRequestURI();
        if (uri != null && (uri.startsWith(req.getContextPath() + "/javax.faces.resource/") || uri.contains("/javax.faces.resource/"))) {
            chain.doFilter(request, response);
            return;
        }

        // Skip JSF partial ajax responses
        String facesReq = req.getHeader("Faces-Request");
        if (facesReq != null && facesReq.contains("partial/ajax")) {
            chain.doFilter(request, response);
            return;
        }

        CharResponseWrapper wrapper = new CharResponseWrapper(resp);
        chain.doFilter(request, wrapper);

        String contentType = wrapper.getContentType();
        String original = wrapper.toString();
        if (original == null) original = "";

        boolean isHtml;
        if (contentType != null) {
            String ct = contentType.toLowerCase();
            isHtml = ct.contains("text/html") || ct.contains("application/xhtml") || ct.contains("text/xhtml");
        } else {
            isHtml = looksLikeHtml(original);
        }
        if (!isHtml || original.isEmpty()) {
            // passthrough
            writeOut(resp, wrapper.getCapturedBytes(), wrapper.getCharacterEncoding());
            return;
        }

        String modified = injectJavaScript(original, redirectOnSessionExpired);
        String encoding = wrapper.getCharacterEncoding() != null ? wrapper.getCharacterEncoding() : "UTF-8";
        byte[] outBytes = modified.getBytes(Charset.forName(encoding));
        // Ensure proper headers and buffer state before writing modified body
        if (contentType != null) {
            resp.setContentType(contentType);
        }
        resp.setCharacterEncoding(encoding);
        resp.resetBuffer();
        OutputStream os = resp.getOutputStream();
        os.write(outBytes);
        os.flush();
    }

    @Override
    public void destroy() { }

    private String loadJavaScript(FilterConfig filterConfig) throws ServletException {
        ServletContext context = filterConfig.getServletContext();
        String realPath = context.getRealPath("/resources/ajax-error-handler.js");
        if (realPath == null) {
            throw new ServletException("Unable to determine real path for ajax-error-handler.js");
        }
        try {
            Path jsFile = Paths.get(realPath);
            String jsContent = new String(Files.readAllBytes(jsFile), StandardCharsets.UTF_8);
            return "<script>" + jsContent + "</script>";
        } catch (IOException e) {
            throw new ServletException("Failed to load ajax-error-handler.js", e);
        }
    }

    private static boolean looksLikeHtml(String s) {
        String t = s.trim();
        return t.startsWith("<!DOCTYPE html") || t.startsWith("<html") || t.contains("</body>");
    }

    private static String injectJavaScript(String html, String javascript) {
        int headIdx = lastIndexIgnoreCase(html, "</head>");
        if (headIdx >= 0) {
            return html.substring(0, headIdx) + javascript + html.substring(headIdx);
        }
        int bodyIdx = lastIndexIgnoreCase(html, "</body>");
        if (bodyIdx >= 0) {
            return html.substring(0, bodyIdx) + javascript + html.substring(bodyIdx);
        }
        return html + javascript;
    }

    private static int lastIndexIgnoreCase(String str, String search) {
        String lower = str.toLowerCase();
        return lower.lastIndexOf(search.toLowerCase());
        }

    private static void writeOut(HttpServletResponse resp, byte[] bytes, String enc) throws IOException {
        if (bytes != null && bytes.length > 0) {
            OutputStream os = resp.getOutputStream();
            os.write(bytes);
            os.flush();
        }
    }

    private static class CharResponseWrapper extends HttpServletResponseWrapper {
        private final ByteArrayOutputStream bos = new ByteArrayOutputStream(32 * 1024);
        private PrintWriter writer;
        private ServletOutputStream outputStream;
        private String contentType;

        CharResponseWrapper(HttpServletResponse response) {
            super(response);
        }

        @Override
        public void setContentType(String type) {
            this.contentType = type;
            super.setContentType(type);
        }

        @Override
        public String getContentType() {
            return contentType != null ? contentType : super.getContentType();
        }

        @Override
        public ServletOutputStream getOutputStream() {
            if (writer != null) {
                throw new IllegalStateException("getWriter() has already been called on this response.");
            }
            if (outputStream == null) {
                outputStream = new ServletOutputStream() {
                    @Override
                    public boolean isReady() { return true; }
                    @Override
                    public void setWriteListener(WriteListener listener) { }
                    @Override
                    public void write(int b) { bos.write(b); }
                };
            }
            return outputStream;
        }

        @Override
        public PrintWriter getWriter() throws IOException {
            if (outputStream != null) {
                throw new IllegalStateException("getOutputStream() has already been called on this response.");
            }
            if (writer == null) {
                String enc = getCharacterEncoding();
                writer = new PrintWriter(new OutputStreamWriter(bos, enc != null ? enc : "UTF-8"));
            }
            return writer;
        }

        @Override
        public void flushBuffer() throws IOException {
            if (writer != null) writer.flush();
            if (outputStream != null) outputStream.flush();
        }

        byte[] getCapturedBytes() throws IOException {
            flushBuffer();
            return bos.toByteArray();
        }

        @Override
        public String toString() {
            try {
                flushBuffer();
                String enc = getCharacterEncoding();
                return bos.toString(enc != null ? enc : "UTF-8");
            } catch (IOException e) {
                return "";
            }
        }
    }
}
