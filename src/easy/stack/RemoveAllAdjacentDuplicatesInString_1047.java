package easy.stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public static void main(String[] args) {
        System.out.println(new RemoveAllAdjacentDuplicatesInString_1047().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String S) {
        if (S == null || S.length() < 2) return S;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.append(stack.pop());
        return result.reverse().toString();
    }

    public String removeDuplicatesAnotherSolution(String S) {
        if (S == null || S.length() < 2) return S;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (result.length() > 0 && result.charAt(result.length() - 1) == c)
                result.deleteCharAt(result.length() - 1);
            else
                result.append(c);
        }

        return result.toString();
    }
}
