package ru.clevertec.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UtilsTest {

    static Stream<String> nums() {
        return Stream.of("12", "79", "55");
    }

    @ParameterizedTest
    @MethodSource("nums")
    void isAllPositiveNumbersTest(String string) {
        Assertions.assertTrue(Utils.isAllPositiveNumbers(string));
    }
}
