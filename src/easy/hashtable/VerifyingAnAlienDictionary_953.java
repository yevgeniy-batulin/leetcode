package easy.hashtable;

// https://leetcode.com/problems/verifying-an-alien-dictionary/
class VerifyingAnAlienDictionary_953 {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length <= 1) return true;
        int[] orderArray = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderArray[index(order.charAt(i))] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (firstBigger(words[i], words[i + 1], orderArray))
                return false;
        }
        return true;
    }

    private boolean firstBigger(String first, String second, int[] order) {
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            int firstOrder = order[index(first.charAt(i))];
            int secondOrder = order[index(second.charAt(i))];
            if (firstOrder > secondOrder)
                return true;
            if (firstOrder < secondOrder)
                return false;
        }
        return first.length() > second.length();
    }

    private int index(char c) {
        return c - 'a';
    }

    public static void main(String[] args) {
        System.out.println(new VerifyingAnAlienDictionary_953().isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
}