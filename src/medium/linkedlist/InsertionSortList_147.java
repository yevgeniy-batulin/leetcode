package medium.linkedlist;

class InsertionSortList_147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();

        while (head != null) {
            ListNode node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }

            ListNode temp = head;
            head = head.next;
            temp.next = node.next;
            node.next = temp;
        }

        return dummy.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode() {
        }
    }

}