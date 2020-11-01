package easy.array;

import java.util.Arrays;
import java.util.Comparator;

class MeetingRooms_252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][1])
                return false;
        }

        return true;
    }
}