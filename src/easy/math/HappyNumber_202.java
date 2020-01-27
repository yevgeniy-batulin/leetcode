package easy.math;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number
class HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber_202().isHappy(2));
    }
}