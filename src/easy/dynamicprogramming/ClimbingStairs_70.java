package easy.dynamicprogramming;

class ClimbingStairs_70 {
	public int climbStairs(int n) {
		if (n < 3) {
			return n;
		}

		int previous = 1;
		int current = 2;

		for (int step = 3; step <= n; step++) {
			int next = previous + current;
			previous = current;
			current = next;
		}

		return current;
	}
}
