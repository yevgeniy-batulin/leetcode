package medium.linkedlist;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

// https://leetcode.com/problems/add-two-numbers/
class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode preHead = new ListNode(-1);
        ListNode current = preHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) current.next = new ListNode(carry);
        return preHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(-1).charAt(0));
    }
}