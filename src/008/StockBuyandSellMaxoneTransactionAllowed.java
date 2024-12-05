
public class StockBuyandSellMaxoneTransactionAllowed {
    public static void main(String[] args) {

    }

    class Solution {
        public int maximumProfit(int prices[]) {
            // Code here
            int n = prices.length;
            int[] minL = new int[n];
            int l = prices[0];
            int r = prices[n - 1];
            int[] maxR = new int[n];
            for (int i = 0; i < n; i++) {
                int val = prices[i];
                minL[i] = Math.min(val, l);
                l = Math.min(val, l);
            }
            for (int i = n - 1; i >= 0; i--) {
                int val = prices[i];
                maxR[i] = Math.max(val, r);
                r = Math.max(val, r);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, maxR[i] - minL[i]);
            }
            return ans < 0 ? 0 : ans;
        }
    }
}
