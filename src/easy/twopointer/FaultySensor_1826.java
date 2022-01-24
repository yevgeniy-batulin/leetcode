package easy.twopointer;

public class FaultySensor_1826 {
    public int badSensor(int[] sensor1, int[] sensor2) {
        if (sensor1.length == 1) {
            return -1;
        }

        int first = 0;
        int second = 0;
        while (first < sensor1.length - 1) {
            if (sensor1[first] != sensor2[second]) {
                if (sensor1[first] != sensor2[second + 1]) {
                    return 2;
                }
                if (sensor2[second] != sensor1[first + 1]) {
                    return 1;
                }
            }

            first++;
            second++;
        }

        return -1;
    }
}
