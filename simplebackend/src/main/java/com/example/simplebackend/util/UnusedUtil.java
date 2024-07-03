package com.example.simplebackend.util;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UnusedUtil {

    public static List<String> splitString(String str) {
        if (isBlank(str)) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        for (String s : str.split(" ")) {
            result.add(s);
        }
        return result;
    }

    private static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}