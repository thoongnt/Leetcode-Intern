public class E_Problem_121 {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int buySell = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            buySell = prices[i] - minBuy;
            result = Math.max(result, buySell);
        }
        return result;
    }
}
