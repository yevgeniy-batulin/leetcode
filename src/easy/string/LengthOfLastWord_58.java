package easy.string;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean wordStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                wordStarted = true;
                count++;
            } else if (wordStarted) {
                break;
            }
        }
        return count;
    }
}
