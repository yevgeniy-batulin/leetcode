package medium.linkedlist;

public class SplitLinkedListInParts_725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int length = length(root);
        int partLength = length / k;
        int remainder = length % k;

        ListNode[] parts = new ListNode[k];
        int min = Math.min(k, length);
        for (int i = 0; i < min; i++) {
            ListNode dummy = new ListNode(-1);
            dummy.next = root;
            ListNode current = dummy;
            for (int j = 0; j < partLength; j++)
                current = current.next;
            if (remainder > 0) {
                current = current.next;
                remainder--;
            }
            root = current.next;
            current.next = null;
            parts[i] = dummy.next;
        }
        return parts;
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
