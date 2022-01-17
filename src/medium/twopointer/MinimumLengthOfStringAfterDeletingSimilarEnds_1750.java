package medium.twopointer;

public class MinimumLengthOfStringAfterDeletingSimilarEnds_1750 {
    public int minimumLength(String string) {
        int left = 0;
        int right = string.length() - 1;
        while (left < right && string.charAt(left) == string.charAt(right)) {
            while (left < right && string.charAt(left) == string.charAt(left + 1)) {
                left++;
            }

            while (left < right && string.charAt(right) == string.charAt(right - 1)) {
                right--;
            }

            left++;
            right--;
        }

        return right < left ? 0 : right - left + 1;
    }
}
