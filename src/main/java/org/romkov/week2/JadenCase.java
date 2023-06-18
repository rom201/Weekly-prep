package org.romkov.week2;

import java.util.Arrays;
import java.util.List;

public class JadenCase {
    public static void main(String[] args) {

        String input = "How can mirrors be real if our eyes aren't real";
//        String input = "  How can mirrors be real if our eyes aren't real  ";
//        String input = "How     can mirrors be real if our eyes aren't real";
//        String input = "";
//        String input = "f";
//        String input = "  ";
//        String input = "ST dgddgdg uru-ddhj r'try";
//         String input = null;
//        System.out.println(input);
        System.out.println(getJadenCasedStrings2(input));
//        System.out.println(input.substring(1));

    }


    public static String getJadenCasedStrings1(String jString) {

        try {
            if (!jString.trim().isEmpty()) {
                List<String> strList = Arrays.asList(jString.split(" "));
                return strList.stream().map(p -> p.substring(0, 1).toUpperCase().concat(p.substring(1).toLowerCase() + " "))
                        .reduce((a, b) -> a.concat(b)).get().trim();
            } else {
                return jString + "this is empty string";
            }
        } catch (NullPointerException e) {
            System.out.println("null");
            return jString;
        }

    }


    public static String getJadenCasedStrings2(String jString) {

        if (jString == null || jString.trim().isEmpty()) {
            return "";
        }

        List<String> strList = Arrays.asList(jString.trim().split("\\s+"));
        return strList.stream().map(p -> p.substring(0, 1).toUpperCase().concat(p.substring(1).toLowerCase() + " "))
                .reduce((a, b) -> a.concat(b)).get().trim();


    }


}
