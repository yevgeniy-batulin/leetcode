package easy.linkedlist;

//https://leetcode.com/problems/remove-linked-list-elements/
class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode cur = head;
        ListNode prev = preHead;
        while (cur != null) {
            if (cur.val == val)
                prev.next = cur.next;
            else
                prev = cur;

            cur = cur.next;
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