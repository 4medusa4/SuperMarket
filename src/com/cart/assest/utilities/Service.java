
package com.cart.assest.utilities;

public class Service {
     public static String getNextId(String id) {
        if (id != null) {
            String prefix = "";
            String str = id;
            int prefix_len = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    prefix_len++;
                    prefix += Character.toString(str.charAt(i));
                }
            }
            str = str.substring(prefix_len);
            int sufix_len = str.length();
            int i = Integer.valueOf(str) + 1;
            id = Integer.toString(i);
            for (int j = 0; j < sufix_len; j++) {
                if (sufix_len > id.length()) {
                    id = "0" + id;
                }
            }
            return prefix + id;
        }
        return "";
    }
    
}
