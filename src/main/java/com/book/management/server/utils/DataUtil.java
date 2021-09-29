package com.book.management.server.utils;

import javax.validation.constraints.NotBlank;

public class DataUtil {

    public static Integer convertStringToInteger(@NotBlank String inputString) {
        return Integer.valueOf(inputString);
    }
}
