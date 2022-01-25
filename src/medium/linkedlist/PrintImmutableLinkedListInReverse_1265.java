package medium.linkedlist;

import java.util.ArrayDeque;

public class PrintImmutableLinkedListInReverse_1265 {
    public void printLinkedListInReverseRecursive(ImmutableListNode head) {
        if (head.getNext() != null) {
            printLinkedListInReverse(head.getNext());
        }
        head.printValue();
    }

    public void printLinkedListInReverse(ImmutableListNode head) {
        ArrayDeque<ImmutableListNode> stack = new java.util.ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }

        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
    }

    private interface ImmutableListNode {
        void printValue();

        ImmutableListNode getNext();
    }
}
