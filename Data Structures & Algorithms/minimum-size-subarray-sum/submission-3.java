class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, windowSub = 0, res = Integer.MAX_VALUE;
        int n = nums.length;
        for (int right = 0; right < n; right++) {

            windowSub += nums[right];

            while (windowSub >= target) {
                res = Math.min(res,right - left + 1);
                windowSub -= nums[left];
                left++;
                
            }

            
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}