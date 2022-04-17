package medium.linkedlist;

public class MergeNodesInBetweenZeros_2181 {
	public ListNode mergeNodes(ListNode head) {
		ListNode prev = head;
		ListNode current = head.next;
		int sum = 0;

		while (current != null) {
			if (current.val == 0) {
				current.val = sum;
				sum = 0;
				prev = prev.next;
			} else {
				sum += current.val;
				prev.next = current.next;
			}

			current = current.next;
		}

		return head.next;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
