package medium.linkedlist;

class SwapNodesInPairs_24 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode current = dummy;

		while (current.next != null && current.next.next != null) {
			ListNode temp = current.next;
			current.next = current.next.next;
			temp.next = current.next.next;
			current.next.next = temp;

			current = current.next.next;
		}

		return dummy.next;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}
	}
}
