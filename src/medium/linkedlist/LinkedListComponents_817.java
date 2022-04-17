package medium.linkedlist;


import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents_817 {
	public int numComponents(ListNode head, int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int count = 0;
		while (head != null) {
			if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) {
				count++;
			}

			head = head.next;
		}

		return count;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}
	}
}
