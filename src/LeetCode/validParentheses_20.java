package LeetCode;

import java.util.Stack;

public class validParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validParentheses_20 pv = new validParentheses_20();
        System.out.println(pv.isValid("()"));        // true
        System.out.println(pv.isValid("([)]"));      // false
    }


}
