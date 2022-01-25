package medium.linkedlist;

public class MaximumTwinSumOfLinkedList_2130 {
    public int pairSum(ListNode head) {
        ListNode middle = getMiddleNode(head);

        ListNode secondHead = middle.next;
        middle.next = null;

        ListNode firstHead = reverse(head);

        return findMaxSum(firstHead, secondHead);
    }

    private ListNode getMiddleNode(ListNode head) {
        int size = getSize(head);

        ListNode current = head;
        for (int index = 0; index < (size / 2) - 1; index++) {
            current = current.next;
        }
        return current;
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    private ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    private int findMaxSum(ListNode firstHead, ListNode secondHead) {
        int maxSum = Integer.MIN_VALUE;
        while (firstHead != null) {
            maxSum = Math.max(maxSum, firstHead.val + secondHead.val);
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return maxSum;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
