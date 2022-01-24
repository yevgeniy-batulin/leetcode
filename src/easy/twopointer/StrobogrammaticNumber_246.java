package easy.twopointer;

import java.util.Map;

public class StrobogrammaticNumber_246 {
    public boolean isStrobogrammatic(String number) {
        Map<Character, Character> rotatedMapping = Map.of('0', '0', '1', '1', '6', '9', '8', '8', '9', '6');
        int left = 0;
        int right = number.length() - 1;
        while (left <= right) {
            char leftChar = number.charAt(left);
            char rightChar = number.charAt(right);

            if (!rotatedMapping.containsKey(leftChar) || rotatedMapping.get(leftChar) != rotatedMapping.get(rightChar)) {
                return false;
            }

            left++;
            right--;
            for (int i = 0, x = 2; i < 2; i++) {

            }
        }
        return true;
    }
}
