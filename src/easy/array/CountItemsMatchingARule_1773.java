package easy.array;

import java.util.List;

public class CountItemsMatchingARule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleVaLue) {
        int ruleIndex = 0;
        if (ruleKey.equals("color")) {
            ruleIndex = 1;
        } else if (ruleKey.equals("name")) {
            ruleIndex = 2;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleVaLue)) {
                count++;
            }
        }
        return count;
    }
}
