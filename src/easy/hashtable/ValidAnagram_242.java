package easy.hashtable;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/
class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.codePointAt(i);
            int count = map.getOrDefault(c, -1);
            if (--count < 0) return false;
            map.put(c, count);
        }
        return true;
    }
}