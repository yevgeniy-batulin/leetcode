package medium.linkedlist;

public class ReorderList_143 {
	public void reorderList(ListNode head) {
		ListNode secondHalf = splitInHalves(head);
		secondHalf = revert(secondHalf);

		while (secondHalf != null) {
			ListNode temp = secondHalf.next;
			secondHalf.next = head.next;
			head.next = secondHalf;

			head = head.next.next;
			secondHalf = temp;
		}
	}

	private ListNode splitInHalves(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode secondHalf = slow.next;
		slow.next = null;
		return secondHalf;
	}

	private ListNode revert(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
