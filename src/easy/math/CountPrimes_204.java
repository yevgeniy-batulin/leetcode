package easy.math;

class CountPrimes_204 {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for(int num = 2; num < n; num++) {
        	if(!notPrimes[num]) {
        		count++;
        		for(int i = 2 * num; i < notPrimes.length; i += num)
        			notPrimes[i] = true;
        	}
        }
        return count;
    }
}