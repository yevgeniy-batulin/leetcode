package medium.array;

class GrumpyBookstoreOwner_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int rollingSum = 0;
        for (int i = 0; i < customers.length; i++)
            if (i < X)
                rollingSum += customers[i];
            else
                rollingSum += customers[i] * (grumpy[i] == 0 ? 1 : 0);

        int max = rollingSum;
        for (int i = X; i < customers.length; i++) {
            if (grumpy[i - X] == 1)
                rollingSum -= customers[i - X];
            if (grumpy[i] == 1)
                rollingSum += customers[i];
            max = Math.max(max, rollingSum);
        }
        return max;
    }
}