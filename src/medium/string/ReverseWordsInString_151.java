package medium.string;

public class ReverseWordsInString_151 {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return "";
        int i = s.length() - 1;
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            while (i >= 0 && s.charAt(i) != ' ') temp.append(s.charAt(i--));

            if (temp.length() != 0) {
                result.append(temp.reverse());
                if (i != -1)
                    result.append(' ');
                temp.delete(0, temp.length());
            }
            i--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString_151().reverseWords("a good   example"));
    }
}
