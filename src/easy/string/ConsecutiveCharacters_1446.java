package easy.string;

class ConsecutiveCharacters_1446 {
    public int maxPower(String s) {
        int maxPower = 1;
        int power = 1;
        char prev = s.charAt(0);

        for(int i = 1; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(c == prev) {
        		power++;
        	} else {
        		power = 1;
        		prev = c;
        	}
        	maxPower = Math.max(maxPower, power);
        }

        return maxPower;
    }
}