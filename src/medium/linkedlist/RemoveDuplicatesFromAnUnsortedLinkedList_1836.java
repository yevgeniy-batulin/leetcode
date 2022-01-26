package medium.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromAnUnsortedLinkedList_1836 {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        Map<Integer, Integer> count = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            count.put(current.val, count.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }

        ListNode preHead = new ListNode();
        preHead.next = head;
        current = preHead;
        while (current != null && current.next != null) {
            if (count.get(current.next.val) > 1) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return preHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
        }
    }
}
