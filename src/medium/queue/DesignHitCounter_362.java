package medium.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DesignHitCounter_362 {
	static class HitCounter {
		private static final int FIVE_MINUTES = 300;
		private final Queue<Integer> q = new LinkedList<>();

		public void hit(int timestamp) {
			q.offer(timestamp);
		}

		public int getHits(int timestamp) {
			while (!q.isEmpty() && q.peek() <= timestamp - FIVE_MINUTES) {
				q.poll();
			}
			return q.size();
		}
	}
}
