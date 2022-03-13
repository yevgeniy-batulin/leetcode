package easy.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks_232 {
	static class MyQueue {
		private final Deque<Integer> readStack = new ArrayDeque<>();
		private final Deque<Integer> writeStack = new ArrayDeque<>();

		public void push(int x) {
			writeStack.push(x);
		}

		public int pop() {
			moveAll();

			return readStack.pop();
		}

		public int peek() {
			moveAll();

			return readStack.peek();
		}

		public boolean empty() {
			return readStack.isEmpty() && writeStack.isEmpty();
		}

		private void moveAll() {
			if (readStack.isEmpty()) {
				while (!writeStack.isEmpty()) {
					readStack.push(writeStack.pop());
				}
			}
		}
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.pop());
		System.out.println(myQueue.empty());
	}
}
