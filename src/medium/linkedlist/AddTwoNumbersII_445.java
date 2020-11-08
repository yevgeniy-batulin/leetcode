package medium.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

class AddTwoNumbersII_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstSize = size(l1);
        int secondSize = size(l2);

        ListNode head = new ListNode(0);
        ListNode smaller;
        ListNode bigger;
        if (firstSize > secondSize) {
            head.next = l1;
            bigger = advance(head, firstSize - secondSize + 1);
            smaller = l2;
        } else {
            head.next = l2;
            bigger = advance(head, secondSize - firstSize + 1);
            smaller = l1;
        }

        while (bigger != null) {
            bigger.val += smaller.val;
            bigger = bigger.next;
            smaller = smaller.next;
        }

        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val >= 9)
                stack.push(prev);

            prev = cur;
            cur = cur.next;
        }

        while (!stack.isEmpty()) {
            ListNode node = stack.pop();

            if (node.next.val > 9) {
                node.val += 1;
                node.next.val %= 10;
            }
        }

        return head.val > 0 ? head : head.next;
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    private ListNode advance(ListNode node, int count) {
        while (count > 0) {
            node = node.next;
            count--;
        }
        return node;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}