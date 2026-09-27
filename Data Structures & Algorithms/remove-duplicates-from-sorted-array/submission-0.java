class Solution {
    public int removeDuplicates(int[] nums) {
        int write = 1;

        for (int num : nums) {
            if (nums[write - 1] != num) {
                nums[write] = num;
                write++;
            }
        }

        return write;
    }
}