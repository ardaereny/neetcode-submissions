class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> w = new HashSet<>();
        int left = 0;

        for (int right = 0 ; right < nums.length ; right++) {
            if(right - left > k){
                w.remove(nums[left]);
                left++;
            }

            if(w.contains(nums[right])) {
                return true;
            }

            w.add(nums[right]);
        
        }

        return false;
    }   
}