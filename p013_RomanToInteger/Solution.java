package p013_RomanToInteger;
/*
Given a roman numeral, convert it to an integer.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // String s="III"; //3
        // String s="LVIII"; //58
        String s="MCMXCIV"; //1994
       
        System.out.println(S1.solution(s));
    }
}

class S1 {
    public static int solution(String s) {
        
        Map<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i=0;i<s.length();i++){
            int cur = map.get(s.charAt(i));

            if(i < s.length()-1){
                int next = map.get(s.charAt(i+1));

                if(cur >= next){
                    sum += cur;
                }

                if(cur < next){
                    sum -= cur;
                } 
            } else {
                sum += cur ;
            }
        }
        return sum;
    }
}
