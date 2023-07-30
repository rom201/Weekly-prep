package org.romkov.week8;

import java.util.*;

public class AlmostEquivalent {

        public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < s.size(); i++) {
                int[] sCount = new int[26];
                int[] tCount = new int[26];
                if (s.get(i).length() != t.get(i).length()){
                    result.add("NO");
                    continue;
                }

                // [0,1,2,3,4,5,6,7,8,9,10,11] index
                // [0,0,1,0,0,2,0,0,0,0,0,0,0]
                for (char c : s.get(i).toCharArray()) {
                    sCount[c - 'a']++; // 'c'  sCount[2]++
                }

                for (char c : t.get(i).toCharArray()) {   // O2
                    tCount[c - 'a']++;
                }

                String res = "YES";
                for (int j = 0; j < 26; j++) {
                    if (Math.abs(sCount[j] - tCount[j]) > 3) {
                        res = "NO";
                        break;
                    }
                }
                result.add(res);
            }
            return result;
        }

        public static List<String> areAlmostEquivalentMap(List<String> s, List<String> t) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < s.size(); i++) {
                // Count occurrences of characters in the first string (s)
                Map<Character, Integer> sCountMap = getCountMap(s, i);

                // Count occurrences of characters in the second string (t)
                Map<Character, Integer> tCountMap = getCountMap(t, i);

                String res = "YES";

                Map<Character, Integer> lastMap;

                if(sCountMap.size() >= tCountMap.size()){
                    lastMap = sCountMap;
                }else{
                    lastMap = tCountMap;
                }

                for (char c : lastMap.keySet()) {
                    int sCount = sCountMap.getOrDefault(c, 0);
                    int tCount = tCountMap.getOrDefault(c, 0);

                    if (Math.abs(sCount - tCount) > 3) {
                        res = "NO";
                        break;
                    }
                }
                result.add(res);
            }
            return result;
        }

        private static Map<Character, Integer> getCountMap(List<String> s, int i) {
            Map<Character, Integer> sCountMap = new HashMap<>();
            for (char c : s.get(i).toCharArray()) {
                sCountMap.put(c, sCountMap.getOrDefault(c, 0) + 1);
            }
            return sCountMap;
        }



//        Map<Character, Integer> charCount = new LinkedHashMap<>();
//        str.chars().forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));


}
