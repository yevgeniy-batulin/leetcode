package easy.bitmanipulation;

class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
    	char different = t.charAt(0);
        for(int i =  0; i  < s.length(); i++) {
        	different ^= (s.charAt(i) ^ t.charAt(i + 1));
        }
        return different;
    }
}