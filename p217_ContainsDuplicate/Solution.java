package p217_ContainsDuplicate;
/*
Given an integer array nums, 
return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] list = new int[] { 1, 2, 3, 1 };
        // int[] list = new int[] { 1, 2, 3, 4 };

        System.out.println(S2.solution(list));
    }

}

// HashSet
class S2 {
    public static boolean solution(int[] list) {
        Set<Integer> set = new HashSet<>();

        for (int num : list) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }
}

// HashMap
class S1 {
    public static boolean solution(int[] list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : list) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            } else {
                return true;
            }
        }
        return false;
    }
}
