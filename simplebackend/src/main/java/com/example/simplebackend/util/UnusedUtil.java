package com.example.simplebackend.util;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class UnusedUtil {

    public static List<String> splitString(String str) {
        if (StringUtils.isBlank(str)) {
            return Lists.newArrayList();
        }
        return Lists.newArrayList(str.split(" "));
    }
}
