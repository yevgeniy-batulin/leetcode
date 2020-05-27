package easy.string;

public class SingleRowKeyboard_1165 {
    public int calculateTime(String keyboard, String word) {
        int[] positions = new int[26];
        for (int i = 0; i < keyboard.length(); i++)
            positions[keyboard.charAt(i) - 'a'] = i;
        int result = 0;
        int current = 0;
        for (int i = 0; i < word.length(); i++) {
            int position = positions[word.charAt(i) - 'a'];
            result += Math.abs(current - position);
            current = position;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("2".charAt(0));
    }
}
