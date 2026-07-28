package p014_LongestCommonPrefix;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

public class Solution {
    public static void main(String[] args) {
        // String[] strs = new String[] { "flower", "flow", "flight" };
        String[] strs = new String[] { "flower", "flow" };
        System.out.println(S1.solution(strs));
    }
}

class S1 {
    public static String solution(String[] strs) {

        StringBuilder res = new StringBuilder();

        // 第一個str的char遞迴
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // 後面剩下的字串 跟第一個字串相比
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(c);
        }
        return res.toString();
    }
}

// class S1 {
//     public static String solution(String[] strs) {

//         String res = "";

//         // 第一個str的char遞迴
//         for (int i = 0; i < strs[0].length(); i++) {
//             char c = strs[0].charAt(i);

//             // 後面剩下的字串 跟第一個字串相比
//             for (int j = 1; j < strs.length; j++) {
//                 if (i == strs[j].length() || c != strs[j].charAt(i)) {
//                     return res;
//                 }
//             }
//             res += String.valueOf(c);
//         }
//         return res;
//     }
// }