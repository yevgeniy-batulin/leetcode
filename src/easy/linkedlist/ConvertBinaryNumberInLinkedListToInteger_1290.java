package easy.linkedlist;

class ConvertBinaryNumberInLinkedListToInteger_1290 {
    public int getDecimalValue(ListNode head) {
        int number = 0;
        while (head.next != null) {
            number += head.val;
            number <<= 1;
            head = head.next;
        }
        number += head.val;
        return number;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}