package org.romkov.week1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AnimalFeast {

    public static void main(String[] args) {

        String str1 = "eoo  uuei";
        String str2 = "efd   fgi";
        boolean result1 = animalFeast(str1, str2);

        System.out.println(result1);
    }


    public static boolean animalFeast(String str1, String str2) {

        if (str1.charAt(0) == str2.charAt(0)
                && str1.charAt(str1.length() - 1) == str1.charAt(str1.length() - 1))
            return true;

        return false;
    }

}