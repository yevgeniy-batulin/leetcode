package easy.dynamicprogramming;

class TribonacciNumber_1137 {
    public int tribonacci(int n) {
    	if(n == 0) return 0;
    	if(n < 3) return 1;

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;
        for(int i = 3; i < n; i++) {
        	int temp = prev3;
        	prev3 = prev3 + prev2 + prev1;
            prev1 = prev2;
        	prev2 = temp;
        }
        return prev1 + prev2 + prev3;
    }
}