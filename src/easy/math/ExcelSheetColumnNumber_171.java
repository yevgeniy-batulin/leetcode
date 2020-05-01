package easy.math;

// https://leetcode.com/problems/excel-sheet-column-number/
class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String s) {
        if (s == null) return -1;

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + s.charAt(i) - 'A' + 1;
        }
        return result;
    }
}