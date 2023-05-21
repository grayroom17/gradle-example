package com.gradle.example.util;

public class StringUtils {

    private static final String EMPTY = "";

    private StringUtils(){}

    public static String trim(String value) {
        return value == null ? EMPTY : value.trim();
    }
}
