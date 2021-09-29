package com.book.management.utils;

import com.book.management.server.utils.DataUtil;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//@RunWith(JUnitPlatform.class)
@Log4j2
public class DataUtilTests {

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @AfterAll
    static void closing() {
        log.info("@AfterAll");
    }

    @AfterEach
    void closingEach() {
        log.info("@AfterEach");
    }

    @Test
    @DisplayName("Normal numeric string")
    public void givenNormalNumericString_WhenBeingConverted_ThenReturnInteger() {
        String numericString = "11";
        assertEquals(11, DataUtil.convertStringToInteger(numericString).intValue());
    }

    @Test
    @DisplayName("Null string")
    public void givenNullString_WhenBeingConverted_ThenThrowsException() {
        assertThrows(NumberFormatException.class, () -> DataUtil.convertStringToInteger(null));
    }

    @Test
    @DisplayName("Null string 2")
    public void givenNullString_WhenBeingConverted_ThenThrowsException2() {
        Throwable exception = assertThrows(NumberFormatException.class, () -> DataUtil.convertStringToInteger(null));
        String exceptionName = exception.getClass().getSimpleName();
        assertEquals("NumberFormatException1", exceptionName);
    }
}
