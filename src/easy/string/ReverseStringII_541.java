package easy.string;

class ReverseStringII_541 {
	public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int index = 0;
		while (index < chars.length) {
			int start = index;
			int end = Math.min(start + k, chars.length) - 1;
			while (start < end) {
				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			}

			index += 2 * k;
		}
		return new String(chars);
	}
}
