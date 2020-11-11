package easy.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FlipGame_293 {
    public List<String> generatePossibleNextMoves(String s) {
        if (s == null || s.length() < 2) return Collections.emptyList();

        StringBuilder suffix = new StringBuilder();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                StringBuilder flipped = new StringBuilder(suffix);
                flipped.append('-').append('-');
                flipped.append(s.substring(i + 2));
                answer.add(flipped.toString());
            }
            suffix.append(s.charAt(i));
        }
        return answer;
    }
}