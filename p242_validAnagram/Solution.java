package p242_validAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/
public class Solution {
    public static void main(String[] args) {
        String s = "anagram2";
        String t = "nagaram";
        System.out.println("2個map的解" + S1.solution(s, t));
        System.out.println("1個map的解" + S2.solution(s, t));
    }
}

// 一個Map
class S2 {
    public static boolean solution(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // s字串 value+1
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // t字串 value-1
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }

        for (int num : map.values()) {
            if (num != 0){
                return false;
            }
        }
        return true;
    }
}

// 兩個Map 比較
class S1 {
    public static boolean solution(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] list1 = s.toCharArray();
        char[] list2 = t.toCharArray();

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], map1.getOrDefault(list1[i], 0) + 1);
            map2.put(list2[i], map2.getOrDefault(list2[i], 0) + 1);
        }

        for (Entry<Character, Integer> entry : map1.entrySet()) {

            char map1Key = entry.getKey();
            int map1Value = entry.getValue();

            if (!map2.containsKey(map1Key)) {
                return false;
            }

            int map2Value = map2.get(map1Key);
            if (map1Value != map2Value) {
                return false;
            }
        }
        return true;
    }
}
