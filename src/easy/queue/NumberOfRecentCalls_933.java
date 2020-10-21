package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls_933 {

    static class RecentCounter {
        private Queue<Integer> q = new LinkedList<>();

        public int ping(int t) {
            while (!q.isEmpty() && t - 3000 - q.peek() > 0)
                q.poll();

            q.offer(t);
            return q.size();
        }
    }
}