package org.romkov.week2;

import java.util.Arrays;
import java.util.List;

public class JadenCase {
    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(4,5,3,9);
//        int result = numbers.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(result);
//
//        //No initial value
//        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
//        System.out.println(result2);
//
//        //Max and Min
//        Optional<Integer> min = numbers.stream().reduce(Integer::min);
//        Optional<Integer> max = numbers.stream().reduce(Integer::max);
//        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
//
//        System.out.println("Min:" + min.get());
//        System.out.println("Max:" + max.get());
//        System.out.println("Sum:" + sum.get());
//
//        //Task
//        int dishCount = DishData.getAll().stream().map(d -> 1).reduce(0,(a,b) -> a+b);
//        System.out.println(dishCount);
//
//        long dcount = DishData.getAll().stream().count();
//        System.out.println(dcount);


//        String input = "How can mirrors be real if our eyes aren't real";
//        String input = "";
        String input = "f";
//        String input = "  ";
//        String input = "ST dgddgdg uru-ddhj r'try";
//         String input = null;
//        System.out.println(input);
//        System.out.println(getJadenCasedStrings2(input));
        System.out.println(input.substring(1));

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

        List<String> strList = Arrays.asList(jString.split("\\s+"));
        System.out.println(strList.size());

        return strList.stream().map(p -> p.substring(0, 1).toUpperCase().concat(p.substring(1).toLowerCase() + " "))
                .reduce((a, b) -> a.concat(b)).get().trim();


    }


}
