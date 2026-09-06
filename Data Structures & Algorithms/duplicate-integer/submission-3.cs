public class Solution {
    public bool hasDuplicate(int[] nums) {
        Dictionary<int, int> resultMap = new Dictionary<int, int>();
        
        for(int i = 0 ; i < nums.Length; i++){
            if(resultMap.ContainsKey(nums[i])) {
                return true;
            }
        
            resultMap.Add(nums[i], 0);

        }

        return false;
    
    }
}