package easy.string;

public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int word2Index = 0;
        int char2Index = 0;
        for (int word1Index = 0; word1Index < word1.length; word1Index++) {
            for (int char1Index = 0; char1Index < word1[word1Index].length(); char1Index++) {
                if (char2Index == word2[word2Index].length()) {
                    char2Index = 0;
                    word2Index++;
                }

                if (word2Index == word2.length
                        || word1[word1Index].charAt(char1Index) != word2[word2Index].charAt(char2Index))
                    return false;
                char2Index++;

            }
        }

        return word2Index == word2.length - 1 && char2Index == word2[word2Index].length();
    }

    public boolean arrayStringsAreEqualAlternative(String[] word1, String[] word2) {
        StringBuilder word1Builder = new StringBuilder();
        for (String part : word1)
            word1Builder.append(part);

        StringBuilder word2Builder = new StringBuilder();
        for (String part : word2)
            word2Builder.append(part);

        return word1Builder.toString().equals(word2Builder.toString());
    }
}