package ru.clevertec;

import org.junit.jupiter.api.*;
import ru.clevertec.stringUtil.StringUtils;

public class StringUtilsTest {

    @Test
    @DisplayName("Проверка на \"true\"")
    void isPositiveNumberTest() {

        String strTrue = "12";

        Assertions.assertTrue(StringUtils.isPositiveNumber(strTrue));
    }

    @Test
    @DisplayName("Проверка на \"false\"")
    void isPositiveNumberTest2() {

        String strFalse = "0";

        Assertions.assertFalse(StringUtils.isPositiveNumber(strFalse));
    }
}
