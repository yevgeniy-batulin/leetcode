package medium.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheWinnerOfTheCircularGame_1823 {
	public int findTheWinner(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}

		int count = k;
		while (q.size() > 1) {
			int player = q.poll();
			count--;
			if (count == 0) {
				count = k;
			} else {
				q.offer(player);
			}
		}

		return q.poll();
	}
}
