package p383_RansomNote;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings ransomNote and magazine, 
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

ransomNote：你想拼出來的字串（勒索信）
magazine：你手上可以使用的字母來源（雜誌）
*/

public class Solution {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        // String ransomNote = "aa";
        // String magazine = "ab";

        System.out.println("S2解:" + S2.solution(ransomNote, magazine));
        System.out.println("S1解:" + S1.solution(ransomNote, magazine));
    }
}

// 把magazine 放入 map
class S2 {
    public static boolean solution(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c,0);

            if (count == 0) {
                return false;
            }

            map.put(c, count - 1);
        }
        return true;
    }
}

// 把ransomNote 放入 map
class S1 {
    public static boolean solution(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    map.put(c, map.get(c) - 1);
                }
            }
        }

        // for (Map.Entry<Character,Integer> entry :map.entrySet()){
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}