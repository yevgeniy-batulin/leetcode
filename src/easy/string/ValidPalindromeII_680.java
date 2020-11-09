package easy.string;

class ValidPalindromeII_680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean removed  = false;
        while(i < j) {
        	if(s.charAt(i) != s.charAt(j)) {
        		if(removed)  return false;

        		removed = true;

        		if(s.charAt(i + 1) == s.charAt(j)) i++;
        		else if(s.charAt(i) == s.charAt(j - 1)) j--;
        		
        	} else {
                i++;
                j--;	
            }
        }
        return true;
    }
}