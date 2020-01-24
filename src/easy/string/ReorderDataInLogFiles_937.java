package easy.string;

import java.util.Arrays;

class ReorderDataInLogFiles_937 {
    public String[] reorderLogFiles(String[] logs) {
        int numberIndex = logs.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            if (Character.isDigit(logs[i].charAt(logs[i].length() - 1))) {
                swap(logs, i, numberIndex);
                numberIndex--;
            }
        }
        Arrays.sort(logs, 0, numberIndex + 1, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);
            int compare = split1[1].compareTo(split2[1]);
            return compare == 0 ? split1[0].compareTo(split2[0]) : compare;
        });
        return logs;
    }

    private void swap(String[] logs, int i, int j) {
        String temp = logs[i];
        logs[i] = logs[j];
        logs[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new ReorderDataInLogFiles_937().reorderLogFiles(
                        new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"})));
    }
}