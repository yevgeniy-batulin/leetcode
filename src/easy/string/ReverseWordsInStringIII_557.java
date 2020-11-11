package easy.string;

class ReverseWordsInStringIII_557 {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
        	int j = i;
        	while(j < s.length() && s.charAt(j) != ' ')
        		j++;

        	int nextI = j + 1;

        	while(j > i)
        		reverse.append(s.charAt(--j));
        	

        	i = nextI;

        	if(i < s.length())
        		reverse.append(' ');
        }
        return reverse.toString();
    }
}