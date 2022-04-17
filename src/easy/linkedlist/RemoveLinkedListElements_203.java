package easy.linkedlist;

class RemoveLinkedListElements_203 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode();
		dummy.next = head;

		ListNode current = dummy;
		while (current.next != null) {
			if (current.next.val == val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
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
