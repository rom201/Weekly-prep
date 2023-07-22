package org.romkov.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.romkov.week2.JadenCase;

import static org.junit.jupiter.api.Assertions.*;

class CountNumOfDuplicatedCharsTest {


    @Test
    void getCountDuplicatedChars_noDuplicates() {

        String input = "abcde";
        Long expected = 0L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: String without duplicates");
    }

    @Test
    void getCountDuplicatedChars_LowerCaseAndDuplicates() {

        String input = "aabbcde";
        Long expected = 2L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Lower case with duplicates");
    }

    @Test
    void getCountDuplicatedChars_LowerUpperCaseAndDuplicates() {

        String input = "aabBcde";
        Long expected = 2L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Lower and Upper case with duplicates");
    }

    @Test
    void getCountDuplicatedChars_LowerCaseAndOneDuplicates() {

        String input = "indivisibility";
        Long expected = 1L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Lower case with one duplicates");
    }

    @Test
    void getCountDuplicatedChars_LowerCaseAndTwoDuplicates() {

        String input = "Indivisibilities";
        Long expected = 2L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Lower case with two duplicates");
    }

    @Test
    void getCountDuplicatedChars_LowerUpperCaseAndNumericDuplicates() {

        String input = "aA11";
        Long expected = 2L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Lower and Upper case with numeric duplicates");
    }

    @Test
    void getCountDuplicatedChars_UpperCaseOnlyDuplicates() {

        String input = "ABBA";
        Long expected = 2L;
        Assertions.assertTrue(expected == CountNumOfDuplicatedChars.getCountDuplicatedChars(input),"Fail: Upper case only duplicates");
    }


}