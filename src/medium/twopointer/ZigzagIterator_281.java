package medium.twopointer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator_281 {
	public class ZigzagIterator {
		private final Queue<Iterator<Integer>> iteratorQueue;

		public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
			iteratorQueue = new LinkedList<>();
			if (!v1.isEmpty()) {
				iteratorQueue.offer(v1.iterator());
			}
			if (!v2.isEmpty()) {
				iteratorQueue.offer(v2.iterator());
			}
		}

		public int next() {
			Iterator<Integer> iterator = iteratorQueue.poll();
			Integer element = iterator.next();
			if (iterator.hasNext()) {
				iteratorQueue.offer(iterator);
			}
			return element;
		}

		public boolean hasNext() {
			if (!iteratorQueue.isEmpty()) {
				return iteratorQueue.peek().hasNext();
			}
			return false;
		}
	}
}
