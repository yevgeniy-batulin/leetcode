package easy.string;

class Hexspeak_1271 {
    public String toHexspeak(String num) {
        StringBuilder hex = new StringBuilder();
        long value = Long.parseLong(num);
        while (value > 0) {
            char c = toHex((int) (value % 16));
            if (c == '!')
                return "ERROR";

            hex.append(c);
            value /= 16;
        }
        return hex.reverse().toString();
    }

    private char toHex(int num) {
        switch (num) {
            case 0:
                return 'O';
            case 1:
                return 'I';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return '!';
        }
    }
}