package medium.linkedlist;

public class RemoveNthNodeFromEndOfList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n; i++) first = first.next;

        while (first != null) {
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
