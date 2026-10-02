public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = prices[0];

        for (int sell : prices) {
            res = Math.max(res, sell - min);
            min = Math.min(min, sell);
        }
        return res;
    }
}