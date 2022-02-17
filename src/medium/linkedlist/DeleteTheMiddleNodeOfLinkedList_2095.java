package medium.linkedlist;

public class DeleteTheMiddleNodeOfLinkedList_2095 {
	public ListNode deleteMiddle(ListNode head) {
		if (head.next == null) {
			return null;
		}

		ListNode fast = head;
		ListNode slow = head;
		ListNode prevSlow = null;
		while (fast != null && fast.next != null) {
			prevSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prevSlow.next = slow.next;
		return head;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
