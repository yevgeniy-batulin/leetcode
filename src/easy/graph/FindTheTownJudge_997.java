package easy.graph;

class FindTheTownJudge_997 {
    public int findJudge(int N, int[][] trust) {
        if (trust.length < N - 1) return -1;

        int[] score = new int[N + 1];
        for (int[] relation : trust) {
            score[relation[1]]++;
            score[relation[0]]--;
        }

        for (int i = 1; i < score.length; i++) {
            if (score[i] == N - 1) return i;
        }

        return -1;
    }
}