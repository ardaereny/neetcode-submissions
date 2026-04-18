class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length ; i++){
        int max1Count = 0;
            while (i < nums.length && nums[i] == 1){
                max1Count++;
                i++;
            }
            if (max1Count > res) {
                res = max1Count;
            }
        }
        return res;
    }
}