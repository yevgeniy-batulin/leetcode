package easy.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {
	static class MyStackWithOneQueue {
		private Queue<Integer> q = new LinkedList<>();

		public void push(int x) {
			q.offer(x);

			int size = q.size();
			while (size > 1) {
				q.offer(q.poll());
				size--;
			}
		}

		public int pop() {
			return q.poll();
		}

		public int top() {
			return q.peek();
		}

		public boolean empty() {
			return q.isEmpty();
		}
	}

	static class MyStackWithTwoQueues {
		private Queue<Integer> mainQ = new LinkedList<>();
		private Queue<Integer> secondQ = new LinkedList<>();

		public void push(int x) {
			mainQ.offer(x);
		}

		public int pop() {
			return moveAllElements();
		}

		public int top() {
			Integer top = moveAllElements();
			mainQ.offer(top);
			return top;
		}

		public boolean empty() {
			return mainQ.isEmpty();
		}

		private Integer moveAllElements() {
			while (mainQ.size() > 1) {
				secondQ.offer(mainQ.poll());
			}

			Queue<Integer> temp = mainQ;
			mainQ = secondQ;
			secondQ = temp;
			return secondQ.poll();
		}
	}
}
