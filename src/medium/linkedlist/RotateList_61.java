package medium.linkedlist;

public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        int length = length(head);
        if (k >= length) k = k % length;
        if (k == 0 || length < 2) return head;

        ListNode current = head;
        for (int i = 1; i < length - k; i++)
            current = current.next;
        ListNode newHead = current.next;
        current.next = null;
        current = newHead;
        while (current.next != null)
            current = current.next;
        current.next = head;
        return newHead;
    }

    private int length(ListNode root) {
        int length = 0;
        while (root != null) {
            root = root.next;
            length++;
        }
        return length;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
