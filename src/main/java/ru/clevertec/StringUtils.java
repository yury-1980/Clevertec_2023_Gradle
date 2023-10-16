package ru.clevertec;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        int num = 0;

        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Wrong format!");
        }

        return num > 0;
    }
}
