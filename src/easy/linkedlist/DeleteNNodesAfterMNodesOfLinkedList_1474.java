package easy.linkedlist;

public class DeleteNNodesAfterMNodesOfLinkedList_1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        if (head == null || m == 0) return null;

        ListNode current = head;
        while (current != null) {
            int keep = m;
            while (keep > 1 && current != null) {
                current = current.next;
                keep--;
            }

            int remove = n;
            while (remove > 0 && current != null && current.next != null) {
                current.next = current.next.next;
                remove--;
            }
            if(current !=  null) current = current.next;
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
