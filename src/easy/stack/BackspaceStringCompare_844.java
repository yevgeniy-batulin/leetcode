package easy.stack;

import java.util.Stack;

class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String S, String T) {
        return process(S).equals(process(T));
    }

    private String process(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}