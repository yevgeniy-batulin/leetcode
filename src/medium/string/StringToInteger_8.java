package medium.string;

public class StringToInteger_8 {
    public int myAtoi(String str) {
        int index = 0;
        while (index < str.length() && str.charAt(index) == ' ')
            index++;

        int sign = 1;
        if (index == str.length())
            return 0;
        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+')
            index++;

        int result = 0;
        while (index < str.length()) {
            char c = str.charAt(index++);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                if (result > (Integer.MAX_VALUE - digit) / 10)
                    return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

                result = result * 10 + digit;
            } else {
                break;
            }
        }

        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger_8().myAtoi("-91283472332"));
    }
}
