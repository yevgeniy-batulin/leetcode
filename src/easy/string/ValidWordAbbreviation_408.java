package easy.string;

class ValidWordAbbreviation_408 {
    public boolean validWordAbbreviation(String word, String abbr) {
        StringBuilder number = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }

            if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') return false;

            while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                number.append(abbr.charAt(j));
                j++;
            }

            i += Integer.parseInt(number.toString());
            number.delete(0, number.length());
        }
        return i == word.length() && j == abbr.length();
    }
}