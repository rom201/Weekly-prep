package org.romkov.week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class FindFirstChar {


    /*
     *Write a function that returns the first non-repeated character from a string.
 If all characters are repeated return a space character.
 EXAMPLE:
 Input: "success"
 Output: u
 Explanation: u and e are non-repeated, u is the first non-repeated characte
     *
     *
     *
     *
     */


    public static void main(String[] args) {

//        String str = "ss";
//        String str = "";
//        String str = " ";
//        String str = "success";
//        String str = "sucUceEss";
        String str = "su$cUceEss"; //if I need handle

        System.out.println(getNonRepeated(str));

    }

    /**
     * String contains only alphabets (both uppercase and lowercase)
     * and numeric digits
     * all inputs and expected results provided
     */

    public static String getNonRepeated(String str) {

        if(str == null) throw new IllegalArgumentException("Input can not be null");

        if(str.trim().isEmpty()) return "1one space";

        List<String> charList = Arrays.asList(str.toLowerCase().split(""));

        try {
            return charList.stream().filter(ch -> Collections.frequency(charList, ch) == 1).findFirst().get();

        }catch (NoSuchElementException e){
            return "one space";
        }

//handle exception here.

    }











}
