package ru.clevertec.stringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StringUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    public static boolean isPositiveNumber(String str) {

        int num = 0;

        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LOGGER.info("Wrong format!");
        }

        return num > 0;
    }
}
