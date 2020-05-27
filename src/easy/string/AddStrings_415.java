package easy.string;

public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int first = 0;
            if (i >= 0)
                first = num1.charAt(i--) - '0';

            int second = 0;
            if (j >= 0) {
                second = num2.charAt(j--) - '0';
            }
            int sum = first + second + carry;
            result.append(sum % 10);
            carry = sum >= 10 ? 1 : 0;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings_415().addStrings("98", "9"));
    }
}
