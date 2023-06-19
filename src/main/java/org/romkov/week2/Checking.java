package org.romkov.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Checking {

    public static void main(String[] args) {

//        String input = "      Jaden       Smith like to cAPItalizE the first LETTER of the words in a sentenCE!  ";
//        String input = "      ";
//        String input = "How can mirrors be real if our eyes aren't real";
//        String input = "       How       can       ";
//        String input = "How     can mirrors be real if our eyes aren't real";
//        String input = "";
//        String input = "f";
//        String input = "  ";
//        String input = "ST dgddgdg uru-ddhj r'try";
        String input = null;
            System.out.println(jadenCase(input));
//            System.out.println(getWord2(input));

        }


        public static String jadenCase (String input){
            String result = "";

            try {
                result = Arrays.stream(input.split(" +"))
                        .map(Checking::capitalize)
                        .collect(Collectors.joining(" ")).trim();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            return result;
        }

        private static String capitalize (String word){

//            if (word == null || word.isEmpty()) {
            if (word.isEmpty()) {
                return word;
            }
            return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase().trim();
        }



        public static String getWord (String str){

        String[] result = str.split(" +");

        return Arrays.toString(result);

        }

        public static List<String> getWord2 (String str){

        List<String> result = Arrays.asList(str.split("\\s+"));

        return result;

    }






}




