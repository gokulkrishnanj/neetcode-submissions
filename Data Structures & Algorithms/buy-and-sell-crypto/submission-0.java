class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            while (left < i && prices[left] >= prices[i]) {
                left++;
            }
            if (prices[i] > prices[left]) {
                maxProfit =
                    maxProfit > (prices[i] - prices[left]) ? maxProfit : (prices[i] - prices[left]);
            }
        }
        return maxProfit;
    }
}
