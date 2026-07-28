package p009_PalindromeNumber;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/

public class Solution {
    public static void main(String[] args) {
        int num = 312213;
        System.out.println(s1.solution(num));
    }
}

class s1 {
    public static boolean solution(int num) {

        char[] list = String.valueOf(num).toCharArray();

        int left = 0;
        int right = list.length-1;

        while (left < right) {
            if (list[left] != list[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
