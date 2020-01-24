package easy.array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock_121().maxProfit(new int[]{3, 2, 6, 5, 0, 3}));
    }
}