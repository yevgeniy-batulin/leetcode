package easy.math;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }   

        int number = x;
        int reversedNumber = 0;
        while(number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return x == reversedNumber;
    }
}
