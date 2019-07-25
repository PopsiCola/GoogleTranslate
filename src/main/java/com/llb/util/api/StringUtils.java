package com.llb.util.api;

/**
 * Ceate By llb on 2019/7/25
 */
public class StringUtils {
    public static boolean isBlank(String string) {
        if (string == null || "".equals(string.trim())) {
            return true;
        }

        return false;
    }

    public static boolean isNotBlank(String string) {
        return !isBlank(string);
    }
}
