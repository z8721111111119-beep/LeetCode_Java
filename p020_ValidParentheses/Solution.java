package p020_ValidParentheses;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false
*/

import java.util.Stack;

// Stack
// push()放進去
// peek()查看頂端
// pop()拿出來
// empty()是否空

public class Solution {
    public static void main(String[] args) {
        // String s = "([])";
        String s = "()[]{}";
        // String s = "([)]";
        System.out.println(S1.solution(s));
    }
}

class S1 {
    public static boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                if (stack.peek() == '{' && c == '}' ||
                        stack.peek() == '[' && c == ']' ||
                        stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}