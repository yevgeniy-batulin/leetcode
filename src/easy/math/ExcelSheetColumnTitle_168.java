package easy.math;

// https://leetcode.com/problems/excel-sheet-column-title/
class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append((char) ('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        return result.reverse().toString();
    }
}