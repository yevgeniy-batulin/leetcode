package easy.string;

class ImplementStrStr_28 {
    public int strStrTwoPointer(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (haystack.length() == 0 || needle.length() == 0) return 0;

        int i = 0;
        int j = 0;
        while (i < haystack.length()) {
            while (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
                i++;
            }

            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == needle.length() && i <= haystack.length()) {
                return i - j;
            } else {
                i -= j - 1;
                j = 0;
            }
        }
        return -1;
    }

    public int strStrKMP(String haystack, String needle) {
        int needleLength = needle.length();
        if (needleLength > haystack.length()) return -1;
        if (haystack.length() == 0 || needleLength == 0) return 0;

        int[] prefixArray = prefixArray(needle + "$" + haystack);
        for (int i = needleLength + 1; i < prefixArray.length; i++) {
            if (prefixArray[i] == needleLength)
                return i - 2 * needleLength;
        }

        return -1;
    }

    private int[] prefixArray(String s) {
        int[] prefixArray = new int[s.length()];
        prefixArray[0] = 0;
        int border = 0;
        for (int i = 1; i < s.length(); i++) {
            while (border > 0 && s.charAt(i) != s.charAt(border))
                border = prefixArray[border - 1];

            if (s.charAt(i) == s.charAt(border))
                border++;
            else
                border = 0;

            prefixArray[i] = border;
        }
        return prefixArray;
    }

    public static void main(String[] args) {
        System.out.println(new ImplementStrStr_28().strStrKMP("hello", "ll"));
        System.out.println(new ImplementStrStr_28().strStrKMP("aaaaa", "bba"));
        System.out.println(new ImplementStrStr_28().strStrKMP("", ""));
        System.out.println(new ImplementStrStr_28().strStrKMP("hellollo", "lol"));
    }
}