package ru.clevertec.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class UtilTest {

    static Stream<String> nums() {
        return Stream.of("125", "79", "55");
    }

    @ParameterizedTest
    @MethodSource("nums")
    void isAllPositiveNumbers(String string) {

            Assertions.assertTrue(Util.isAllPositiveNumbers(string));

    }
}