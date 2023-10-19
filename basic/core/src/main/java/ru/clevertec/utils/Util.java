package ru.clevertec.utils;

import ru.clevertec.stringUtils.StringUtil;

public class Util {

    public static boolean isAllPositiveNumbers(String... str) {

        for (String s : str) {
            if (!StringUtil.isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}
