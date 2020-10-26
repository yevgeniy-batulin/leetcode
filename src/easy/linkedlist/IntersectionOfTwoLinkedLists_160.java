package easy.linkedlist;

public class IntersectionOfTwoLinkedLists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null || !intersect(headA, headB)) return null;

        int aSize = size(headA);
        int bSize = size(headB);

        int advance = Math.abs(aSize - bSize);
        if (aSize > bSize)
            headA = advance(headA, advance);
        else
            headB = advance(headB, advance);

        return intersectionNode(headA, headB);
    }

    private boolean intersect(ListNode headA, ListNode headB) {
        return lastNode(headA) == lastNode(headB);
    }

    private ListNode lastNode(ListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    private ListNode advance(ListNode node, int advance) {
        while (advance-- > 0)
            node = node.next;
        return node;
    }

    private ListNode intersectionNode(ListNode headA, ListNode headB) {
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}