package easy.array;

class PairsOfSongsWithTotalDurationsDivisibleBy60_1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] array = new int[60];
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            int mod = time[i] % 60;
            int remaining = (60 - mod) % 60;
            count += array[remaining];
            array[mod]++;
        }
        return count;
    }
}