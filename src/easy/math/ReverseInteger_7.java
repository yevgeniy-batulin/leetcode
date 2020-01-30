package easy.math;

// https://leetcode.com/problems/reverse-integer/
class ReverseInteger_7 {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger_7().reverse(-1234));
    }
}