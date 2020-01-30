package easy.math;

// https://leetcode.com/problems/roman-to-integer/
class RomanToInteger_13 {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = 0;
            if (s.charAt(i) == 'M') {
                val = 1000;
            } else if (s.charAt(i) == 'D') {
                val = 500;
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) val = -100;
                else val = 100;
            } else if (s.charAt(i) == 'L') {
                val = 50;
            } else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) val = -10;
                else val = 10;
            } else if (s.charAt(i) == 'V') {
                val = 5;
            } else if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) val = -1;
                else val = 1;
            }
            result += val;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger_13().romanToInt("MCMXCIV"));
    }
}