package easy.array;

// https://leetcode.com/problems/fibonacci-number/
class FibonacciNumber_509 {
    public int fib(int n) {
        if (n == 0) return 0;

        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[n];
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber_509().fib(4));
    }
}