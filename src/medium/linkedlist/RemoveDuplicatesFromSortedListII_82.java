package medium.linkedlist;

public class RemoveDuplicatesFromSortedListII_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        ListNode current = preHead;
        while (current.next != null) {
            ListNode duplicates = current.next;
            if (duplicates.next != null && duplicates.val == duplicates.next.val) {
                while (duplicates.next != null && duplicates.val == duplicates.next.val) {
                    duplicates = duplicates.next;
                }
                current.next = duplicates.next;
            } else {
                current = current.next;
            }
        }

        return preHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
