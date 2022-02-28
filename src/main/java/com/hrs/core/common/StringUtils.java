package com.hrs.core.common;

public class StringUtils {

    public static boolean isEmpty(String text) {
        return text == null || text.length() == 0;
    }

    public static boolean hasText(String text) {
        return text != null && text.trim().length() > 0;
    }
}
