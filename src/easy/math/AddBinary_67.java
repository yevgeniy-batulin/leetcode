package easy.math;

class AddBinary_67 {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) return addBinary(b, a);

        StringBuilder result = new StringBuilder();
        int move = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') move++;
            if (j >= 0 && b.charAt(j--) == '1') move++;

            if (move % 2 == 0) result.append('0');
            else result.append('1');

            move /= 2;
        }
        if (move == 1) result.append('1');
        return result.reverse().toString();
    }
}