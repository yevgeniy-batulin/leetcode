package medium.linkedlist;

public class FindMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int index = 1;
        int firstFoundIndex = -1;
        int lastFoundIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        while (head.next != null) {
            if (isCriticalPoint(head.next, head.val)) {
                if (firstFoundIndex == -1) {
                    firstFoundIndex = index;
                } else if (lastFoundIndex != -1) {
                    minDistance = Math.min(minDistance, index - lastFoundIndex);
                }

                lastFoundIndex = index;
            }
            head = head.next;
            index++;
        }

        if (lastFoundIndex == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{minDistance, lastFoundIndex - firstFoundIndex};
    }

    private boolean isCriticalPoint(ListNode node, int previousValue) {
        if (node.next == null) {
            return false;
        }

        return (node.val < previousValue && node.val < node.next.val)
                || (node.val > previousValue && node.val > node.next.val);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
