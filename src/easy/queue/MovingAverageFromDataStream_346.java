package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream_346 {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }

    static class MovingAverage {
        private Queue<Integer> queue;
        private int size;
        private double sum;

        /**
         * Initialize your data structure here.
         */
        public MovingAverage(int size) {
            queue = new LinkedList<>();
            this.size = size;
        }

        public double next(int val) {
            if (queue.size() == size)
                sum -= queue.poll();

            queue.offer(val);
            sum += val;
            return sum / queue.size();
        }
    }

}
