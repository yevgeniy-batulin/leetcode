package medium.linkedlist;

public class PartitionList_86 {
	public ListNode partition(ListNode head, int x) {
		ListNode before = new ListNode(0);
		ListNode beforeDummy = before;
		ListNode after = new ListNode(0);
		ListNode afterDummy = after;


		while(head != null) {
			if(head.val < x) {
				before.next = head;
				before = before.next;
			} else {
				after.next = head;
				after = after.next;
			}

			head = head.next;
		}
		after.next = null;
		before.next = afterDummy.next;
		return beforeDummy.next;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
