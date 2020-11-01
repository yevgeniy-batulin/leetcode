package easy.linkedlist;

class ConvertBinaryNumberInLinkedListToInteger_1290 {
    public int getDecimalValue(ListNode head) {
        int value = 0;
        while(head != null) {
            value = (value * 2) + head.val;
            head = head.next;
        }
        return value;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}