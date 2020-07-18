package easy.string;

public class RotatedDigits_788 {
    public static void main(String[] args) {
        System.out.println(new RotatedDigits_788().rotatedDigits(10));
    }

    public int rotatedDigits(int N) {
        int count = 0;
        outer:
        for (int i = 1; i <= N; i++) {
            int number = i;
            int rotatedNumber = 0;
            int multiplier = 1;
            while (number != 0) {
                int n = number % 10;
                int rotatedDigit = n;
                if (n == 3 || n == 4 || n == 7) continue outer;
                if (n == 2) rotatedDigit = 5;
                if (n == 5) rotatedDigit = 2;
                if (n == 6) rotatedDigit = 9;
                if (n == 9) rotatedDigit = 6;
                rotatedNumber += rotatedDigit * multiplier;
                multiplier *= 10;
                number /= 10;
            }
            if (rotatedNumber != i) count++;
        }
        return count;
    }
}
