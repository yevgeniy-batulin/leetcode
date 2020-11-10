package easy.array;

class NumberOfEquivalentDominoPairs_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int answer = 0;
        for (int[] domino : dominoes) {
            int value = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0], domino[1]);
            answer += count[value];
            count[value]++;
        }
        return answer;
    }
}