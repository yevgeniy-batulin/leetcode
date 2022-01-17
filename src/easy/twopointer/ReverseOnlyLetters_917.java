package easy.twopointer;

public class ReverseOnlyLetters_917 {
    public String reverseOnlyLetters(String string) {
        int left = 0;
        int right = string.length() - 1;
        StringBuilder reversed = new StringBuilder(string);

        while (left < right) {
            while (left < right && !isLetter(string.charAt(left))) {
                left++;
            }

            while (left < right && !isLetter(string.charAt(right))) {
                right--;
            }


            char temp = reversed.charAt(left);
            reversed.setCharAt(left++, string.charAt(right));
            reversed.setCharAt(right--, temp);
        }

        return reversed.toString();
    }

    private boolean isLetter(char character) {
        return (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
    }
}
