package easy.twopointer;

public class CountBinarySubstrings_696 {
    public int countBinarySubstrings(String string) {
        int count = 1;
        int lastCount = 0;
        int result = 0;

        for (int index = 1; index < string.length(); index++) {
            if (string.charAt(index) == string.charAt(index - 1)) {
                count++;
            } else {
                result += Math.min(count, lastCount);
                lastCount = count;
                count = 1;
            }
        }
        return result + Math.min(count, lastCount);
    }
}
