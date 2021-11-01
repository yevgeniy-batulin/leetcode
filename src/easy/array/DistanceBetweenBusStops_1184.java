package easy.array;

public class DistanceBetweenBusStops_1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int min = Math.min(start, destination);
        int max = Math.max(start, destination);

        int sum = 0;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
        }

        int clockwise = 0;
        for (int i = min; i < max; i++) {
            clockwise += distance[i];
        }

        return Math.min(clockwise, sum - clockwise);
    }
}
