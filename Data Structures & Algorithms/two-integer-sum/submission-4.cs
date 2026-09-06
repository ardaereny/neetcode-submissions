public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> map = new Dictionary<int, int>();

        for(int i = 0 ; i < nums.Length ; i++) {
            int num = nums[i];
            int diff = target - num;

            if(map.ContainsKey(num)) {
                return new int[] {map[num], i};
            }

            map.Add(diff, i);
        }
        return new int[] {};

    }
}
