package easy.stack;

import java.util.Stack;

public class BaseballGame_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : ops) {
            if (operation.equals("+")) {
                int top = stack.pop();
                int sum = top + stack.peek();
                stack.push(top);
                stack.push(sum);
            } else if (operation.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (operation.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operation));
            }
        }

        int sum = 0;
        for (int element : stack)
            sum += element;
        return sum;
    }
}
