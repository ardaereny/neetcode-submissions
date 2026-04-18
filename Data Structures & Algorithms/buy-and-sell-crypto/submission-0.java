class Solution {
    public int maxProfit(int[] prices) {
        int r = 1;
        int result = 0;

        for (int left = 0 ; left < prices.length ; left++){
            r = left +1;
            while (r < prices.length && prices[left] < prices[r]) {
            result = Math.max(prices[r] - prices[left], result);
                r++;
            }
        }

        return result;
    }
}
