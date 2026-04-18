class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
           if(map.get(key) > nums.length / 2) {
               result = key;
           }
        }


        return result;
    }
}