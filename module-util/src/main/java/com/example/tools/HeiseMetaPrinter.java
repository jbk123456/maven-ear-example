package com.example.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;

public final class HeiseMetaPrinter {
    private static final String HEISE_URL = "https://heise.de";
    private static final Pattern META_TAG_PATTERN = Pattern.compile("<meta\\s+([^>]*?)>", Pattern.CASE_INSENSITIVE);
    private static final Pattern ATTR_PATTERN = Pattern.compile("(name|property|content)\\s*=\\s*\"([^\"]*)\"", Pattern.CASE_INSENSITIVE);

    private HeiseMetaPrinter() {
    }

    public static void main(String[] args) throws Exception {
        String trustStorePath = args.length > 0 ? args[0] : System.getenv("HEISE_TRUSTSTORE_PATH");
        String trustStorePassword = args.length > 1 ? args[1] : System.getenv("HEISE_TRUSTSTORE_PASSWORD");
        String html = fetchHtml(HEISE_URL, trustStorePath, trustStorePassword);
        Map<String, String> meta = extractMeta(html);

        System.out.println("Meta tags from " + HEISE_URL + ":");
        for (Map.Entry<String, String> entry : meta.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    private static String fetchHtml(String url, String trustStorePath, String trustStorePassword) throws Exception {
        URL urlObj = new URL(url);
        HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
        
        if (trustStorePath != null && !trustStorePath.isEmpty()) {
            SSLContext sslContext = buildSslContext(trustStorePath, trustStorePassword);
            connection.setSSLSocketFactory(sslContext.getSocketFactory());
        }
        
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "maven-ear-example/1.0");
        connection.setConnectTimeout(10000);
        connection.setReadTimeout(15000);
        connection.setInstanceFollowRedirects(true);
        
        int statusCode = connection.getResponseCode();
        if (statusCode < 200 || statusCode >= 300) {
            throw new IllegalStateException("Unexpected HTTP status: " + statusCode);
        }
        
        StringBuilder html = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                html.append(line).append("\n");
            }
        } finally {
            reader.close();
        }
        connection.disconnect();
        
        return html.toString();
    }

    private static Map<String, String> extractMeta(String html) {
        Map<String, String> meta = new LinkedHashMap<>();
        Matcher metaTagMatcher = META_TAG_PATTERN.matcher(html);
        while (metaTagMatcher.find()) {
            String attrs = metaTagMatcher.group(1);
            String key = null;
            String content = null;
            Matcher attrMatcher = ATTR_PATTERN.matcher(attrs);
            while (attrMatcher.find()) {
                String attr = attrMatcher.group(1).toLowerCase();
                String value = attrMatcher.group(2).trim();
                if ("name".equals(attr) || "property".equals(attr)) {
                    key = value;
                } else if ("content".equals(attr)) {
                    content = value;
                }
            }
            if (key != null && content != null && !meta.containsKey(key)) {
                meta.put(key, content);
            }
        }
        return meta;
    }

    private static SSLContext buildSslContext(String trustStorePath, String trustStorePassword) throws Exception {
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        char[] password = trustStorePassword != null ? trustStorePassword.toCharArray() : new char[0];
        try (FileInputStream inputStream = new FileInputStream(trustStorePath)) {
            trustStore.load(inputStream, password);
        }

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(trustStore);

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);
        return sslContext;
    }
}
