package easy.string;

public class ReverseVowelsOfString_345 {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            while (i < j && !isVowel(array[i]))
                i++;
            while (j > i && !isVowel(array[j]))
                j--;

            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
        return new String(array);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
