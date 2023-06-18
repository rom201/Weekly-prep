package org.romkov.week1;

import java.util.*;

public class NonRepeatingVowel_1 {

    public static void main(String[] args) {

        String str1 = "eoouuei";
        Integer result1 = getIndexOfFirstNonRepeatingVowel_listCollections(str1);
        Integer result2 = getIndexOfFirstNonRepeatingVowel_stream(str1);


          System.out.println(result1);
        System.out.println("------------");
          System.out.println(result2);
    }



    static int getIndexOfFirstNonRepeatingVowel_map(String input){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)){
                    map.put(ch, i);
                    System.out.println(map);
                } else {
                    map.put(ch, -5);
                }
            }
        }

        System.out.println(map);


        if (!map.isEmpty()){
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                int index = e.getValue();
                if ( index != -5){
                    return index;
                }
            }
        }
        return -1;
    }


    static LinkedHashMap<Character, Integer> putData_map(String input){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        map.put(input.charAt(0), 1);
        map.put(input.charAt(1), 1);
        map.put(input.charAt(2), 1);
        map.put(input.charAt(3), 1);
        map.put(input.charAt(4), 1);

        return map;

    }

    static int getIndexOfFirstNonRepeatingVowel_listCollections(String input) {

        ArrayList<String> chList = new ArrayList<String>(Arrays.asList(input.split("")));

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                if (Collections.frequency(chList, chList.get(i)) == 1) {
                    return i;
                }
            }
        }
        return -1;
    }




    static int getIndexOfFirstNonRepeatingVowel_stream(String input) {

        LinkedList<String> chList = new LinkedList<>(Arrays.asList(input.split("")));
        try {
            return chList.indexOf(
                    chList.stream().filter(ch->ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u"))
                            .filter(ch->Collections.frequency(chList, ch)==1).findFirst().get());
        }catch (Exception e) {
            return -1;
        }
    }

}
