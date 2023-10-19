package ru.clevertec.stringUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    @DisplayName("Проверка на true")
    void isPositiveNumber() {

        String strTrue = "12";

        Assertions.assertTrue(StringUtil.isPositiveNumber(strTrue));
    }

    @Test
    @DisplayName("Проверка на false")
    void isPositiveNumber2() {

        String strFalse = "0";

        Assertions.assertFalse(StringUtil.isPositiveNumber(strFalse));
    }
}