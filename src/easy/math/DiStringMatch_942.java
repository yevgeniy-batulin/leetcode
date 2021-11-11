package easy.math;

public class DiStringMatch_942 {
	public int[] diStringMatch(String s) {
		int low = 0;
		int high = s.length();
		int[] array = new int[s.length() + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				array[i] = low++;
			} else {
				array[i] = high--;
			}
		}
		array[array.length - 1] = low;
		return array;
	}
}
