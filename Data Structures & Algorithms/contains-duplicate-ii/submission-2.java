class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
           int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {

            if (map.containsKey(nums[r]) && r - map.get(nums[r]) <= k) {
                return true;
            }

            if (r - left > k) {
                map.remove(nums[left]);
                left++;
            }

            map.put(nums[r], r);
            
        }


        return false;
    
    }
}