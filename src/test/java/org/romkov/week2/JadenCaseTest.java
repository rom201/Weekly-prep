
package org.romkov.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    @Test
    void getJadenCasedStrings2_happy() {
        String actual = "How can mirrors be real if our eyes aren't real";
        String expected = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_null() {
        String actual = null;
        String expected = "";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_empty() {
        String actual = "";
        String expected = "";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }
    @Test
    void getJadenCasedStrings2_oneBlank() {
        String actual = " ";
        String expected = "";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }
    @Test
    void getJadenCasedStrings2_manyBlank() {
        String actual = "    ";
        String expected = "";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_blanksBeforeAfter() {
        String actual = " How can mirrors ";
        String expected = "How Can Mirrors";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_blanksIn() {
        String actual = "How can     mirrors";
        String expected = "How Can Mirrors";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_singleChar() {
        String actual = "t";
        String expected = "T";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

    @Test
    void getJadenCasedStrings2_capitals() {
        String actual = "DC is   great";
        String expected = "Dc Is Great";
        Assertions.assertEquals(expected, JadenCase.getJadenCasedStrings2(actual));
    }

}

