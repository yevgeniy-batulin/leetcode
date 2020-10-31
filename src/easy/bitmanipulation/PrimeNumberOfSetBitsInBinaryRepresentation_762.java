package easy.bitmanipulation;

import java.util.Set;

class PrimeNumberOfSetBitsInBinaryRepresentation_762 {
    private static final Set<Integer> PRIMES = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (PRIMES.contains(countOfOnes(i)))
                count++;
        }
        return count;
    }

    private int countOfOnes(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num &= (num - 1);
        }
        return count;
    }
}