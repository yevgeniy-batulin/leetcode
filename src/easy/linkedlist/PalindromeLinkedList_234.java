package easy.linkedlist;

// https://leetcode.com/problems/palindrome-linked-list/
class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int i = 0;
        current = head;
        while (i < size / 2 - 1) {
            current = current.next;
            i++;
        }

        if (size % 2 != 0) {
            ListNode temp = current.next;
            current.next = null;
            current = temp;
        }

        ListNode secondHalf = current.next;
        current.next = null;
        ListNode firstHalf = revertList(head);

        while (secondHalf != null && firstHalf != null) {
            if (secondHalf.val != firstHalf.val)
                return false;
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }

    private ListNode revertList(ListNode node) {
        ListNode previous = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = previous;
            previous = node;
            node = temp;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        System.out.println(new PalindromeLinkedList_234().isPalindrome(node));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}