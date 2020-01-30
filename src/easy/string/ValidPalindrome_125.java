package easy.string;

// https://leetcode.com/problems/valid-palindrome/
class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if (!Character.isLetterOrDigit(s.charAt(j))) j--;
            else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome_125().isPalindrome("\"Sue,\" Tom smiles, \"Selim smote us.\""));
    }
}