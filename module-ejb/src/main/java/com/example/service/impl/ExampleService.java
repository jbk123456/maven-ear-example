package com.example.service.impl;

import java.util.Optional;
import java.util.Properties;
import java.util.function.Supplier;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.example.service.IExampleService;
import com.example.service.IRemoteExampleService;
import com.example.to.ExampleTO;

@Stateless
public class ExampleService implements IExampleService {

        @Inject
        @ConfigProperty(name="name")
        private Optional<String> name;

        @Override
        public String whoAmI(ExampleTO to) {
            //Gson gson = new Gson();
            try {
                String prefix = "corbaname:iiop:localhost:2809";
                Properties p = new Properties();
                p.put(Context.PROVIDER_URL, prefix);
                InitialContext ic = new InitialContext(p);

                String binding ;
                binding = "java:global/application-ear-1.0-SNAPSHOT/com.example-firstbean-1.0-SNAPSHOT/RemoteExampleService!com.example.service.IRemoteExampleService";
                //binding = "ejb/global/application-ear-1.0-SNAPSHOT/com.example-firstbean-1.0-SNAPSHOT/RemoteExampleService!com.example.service.IRemoteExampleService";
                //binding = "application-ear-1.0-SNAPSHOT/com.example-firstbean-1.0-SNAPSHOT/RemoteExampleService!com.example.service.IRemoteExampleService";
                String lookup = prefix + "#"+ toCorbaname(binding);
                lookup = toCorbaname(binding);
                lookup = (binding);
                System.out.println("lookup:::"+lookup);
                
                Object ns = ic.lookup(lookup);
                System.out.println("NS:::"+ns);
                IRemoteExampleService rs = (IRemoteExampleService) ns;
               // IRemoteExampleService rs = (IRemoteExampleService)PortableRemoteObject.narrow(ns, IRemoteExampleService.class);
                System.out.println("calling IRemoteExampleService:::"+rs.whoAmI(to));

            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw new IllegalArgumentException(e);
            }
            return String.format("i'm %s", name.get());
        }
        private static String toCorbaname(String jndiName) {
            // Escape . into %5C%2E (\.) since it's an INS naming delimiter
            // For example, sca.sample.StockQuote --->
            // sca%5C%2Esample%5C%2EStockQuote/StockQuote
            return replace(encode2396(jndiName), ".", "%5C%2E");
        }
            /**
         * The character escape rules for the stringified name portion of an
         * corbaname are: US-ASCII alphanumeric characters are not escaped.
         * Characters outside this range are escaped, except for the following: ; / : ? @ & = + $ , - _ . ! ~ * ' ( )
         * corbaname Escape Mechanism The percent '%' character is used as an
         * escape. If a character that requires escaping is present in a name
         * component it is encoded as two hexadecimal digits following a "%"
         * character to represent the octet. (The first hexadecimal character
         * represent the highorder nibble of the octet, the second hexadecimal
         * character represents the low-order nibble.) If a '%' is not followed by
         * two hex digits, the stringified name is syntactically invalid.
         * @param s
         * @return RFC2396-encoded stringified name
         */
        static String encode2396(String s) {
            if (s == null) {
                return null;
            }
            StringBuffer encoded = new StringBuffer(s);
            for (int i = 0; i < encoded.length(); i++) {
                char c = encoded.charAt(i);
                if (RFC2396.indexOf(c) == -1) {
                    encoded.setCharAt(i, '%');
                    char[] ac = Integer.toHexString(c).toCharArray();
                    if (ac.length == 2) {
                        encoded.insert(i + 1, ac);
                    } else if (ac.length == 1) {
                        encoded.insert(i + 1, '0');
                        encoded.insert(i + 2, ac[0]);
                    } else {
                        throw new IllegalArgumentException("Invalid character '" + c + "' in \"" + s + "\"");
                    }
                    i += 2; // NOPMD
                }
            }
            return encoded.toString();
        }
        private static final String RFC2396 =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789;/:?@&=+$,-_.!~*'()";
        /**
         * Replace substrings
         * 
         * @param source The source string.
         * @param match The string to search for within the source string.
         * @param replace The replacement for any matching components.
         * @return
         */
        private static String replace(String source, String match, String replace) {
            int index = source.indexOf(match, 0);
            if (index >= 0) {
    
                // We have at least one match, so got to do the
                // work...
    
                StringBuffer result = new StringBuffer(source.length() + 16);
                int matchLength = match.length();
                int startIndex = 0;
    
                while (index >= 0) {
                    result.append(source.substring(startIndex, index));
                    result.append(replace);
                    startIndex = index + matchLength;
                    index = source.indexOf(match, startIndex);
                }
    
                // Grab the last piece, if any...
                if (startIndex < source.length()) {
                    result.append(source.substring(startIndex));
                }
    
                return result.toString();
    
            } else {
                // No matches, just return the source...
                return source;
            }
        }
}
