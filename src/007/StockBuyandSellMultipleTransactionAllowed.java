public class StockBuyandSellMultipleTransactionAllowed {

    public static void main(String[] args) {

    }

    // User function Template for Java
    class Solution {
        public int maximumProfit(int prices[]) {
            // code here
            int ans = 0;
            int start = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i - 1] > prices[i]) {
                    ans += prices[i - 1] - start;
                    start = prices[i];
                } else if (i == prices.length - 1) {
                    ans += prices[i] - start;
                }
            }
            return ans;
        }
    }
}