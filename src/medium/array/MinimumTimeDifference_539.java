package medium.array;

import java.util.List;

public class MinimumTimeDifference_539 {
    private static final int MINUTES_IN_DAY = 24 * 60;

    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0;

        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        int[] count = new int[MINUTES_IN_DAY];
        for (String timePoint : timePoints) {
            int time = timeToInt(timePoint);
            if (count[time] == 1) return 0;
            count[time]++;
            if (time > last) last = time;
            if (time < first) first = time;
        }

        int min = Integer.MAX_VALUE;
        int prev = first;
        for (int current = first + 1; current <= last; current++) {
            if (count[current] == 0) continue;

            int dif = current - prev;
            min = Math.min(min, dif);
            prev = current;
        }

        min = Math.min(min, first + MINUTES_IN_DAY - last);
        return min;
    }

    private int timeToInt(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60
                + Integer.parseInt(time.substring(3, 5));
    }

    public static void main(String[] args) {
        System.out.println(new MinimumTimeDifference_539().findMinDifference(List.of("00:00", "23:59")));
    }
}
