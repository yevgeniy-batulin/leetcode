package easy.string;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
class ValidParentheses_20 {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if ((c == ')' && pop != '(') || (c == ']' && pop != '[') || (c == '}' && pop != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}