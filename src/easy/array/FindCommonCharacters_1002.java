package easy.array;

import java.util.ArrayList;
import java.util.List;

class FindCommonCharacters_1002 {
    public List<String> commonChars(String[] A) {
        int[][] counts = new int[A.length][26];
        for(int i = 0; i < A.length; i++) 
        	counts[i] = count(A[i]);

        List<String> commonChars = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
        	int occurence = Integer.MAX_VALUE;
        	for(int j = 0; j < counts.length; j++) {
        		occurence = Math.min(occurence, counts[j][i]);
        	}
        	while(occurence > 0)  {
        		commonChars.add(Character.toString(i + 'a'));
                occurence--;
            }
        }
        return commonChars;
    }

    private int[] count(String s) {
    	int[] count = new int[26];
    	for(char c : s.toCharArray())
    		count[c - 'a']++;
    	return count;
    }
}