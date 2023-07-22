package org.romkov.week3;

import java.util.*;

public class CountNumOfDuplicatedChars {

    public static void main(String[] args) {

        String str = "aabbcde";
        System.out.println(getCountDuplicatedChars2(str));

    }

    /**
     * String contains only alphabets (both uppercase and lowercase)
     * and numeric digits
     * all inputs and expected results provided
     */

    public static Long getCountDuplicatedChars(String str) {

        List<String> charList = Arrays.asList(str.toLowerCase().split(""));
        return charList.stream().filter(ch -> Collections.frequency(charList, ch)>1).distinct().count();
    }

    public static Integer getCountDuplicatedChars2(String str) {

// need to construct

        return 1;
    }

}
