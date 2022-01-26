package medium.linkedlist;

public class MergeInBetweenLinkedLists_1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode beforeA = list1;
        ListNode afterB = list1;

        while (a > 1) {
            beforeA = beforeA.next;
            afterB = afterB.next;
            a--;
            b--;
        }

        while (b >= 0) {
            afterB = afterB.next;
            b--;
        }

        beforeA.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = afterB;

        return list1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
