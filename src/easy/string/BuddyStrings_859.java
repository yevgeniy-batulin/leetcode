package easy.string;

class BuddyStrings_859 {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        if (a.equals(b)) return hasRepeatingCharacters(a);

        int first = -1;
        int second = -1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i))
                continue;

            if (first == -1)
                first = i;
            else if (second == -1)
                second = i;
            else
                return false;
        }

        return second != -1 && a.charAt(first) == b.charAt(second) && a.charAt(second) == b.charAt(first);
    }

    private boolean hasRepeatingCharacters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) return true;
        }
        return false;
    }
}