package easy.string;

public class CrawlerLogFolder_1598 {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    continue;
                case "../":
                    if (result > 0) result--;
                    break;
                default:
                    result++;
            }
        }
        return Math.max(result, 0);
    }
}
