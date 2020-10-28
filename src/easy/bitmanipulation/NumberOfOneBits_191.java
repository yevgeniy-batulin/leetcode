package easy.bitmanipulation;

public class NumberOfOneBits_191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 1; i <= 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}