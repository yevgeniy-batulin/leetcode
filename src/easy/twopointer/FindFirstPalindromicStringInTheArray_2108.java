package easy.twopointer;

public class FindFirstPalindromicStringInTheArray_2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        for (int index = 0; index < word.length() / 2; index++) {
            if (word.charAt(index) != word.charAt(word.length() - index - 1)) {
                return false;
            }
        }
        return true;
    }
}
