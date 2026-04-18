class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = 1;
        int[] result;

        while (numbers[l] == numbers[r] || numbers[l] > numbers[r] || 
            numbers[l] + numbers[r] != target) {
            
                if(r == numbers.length -1){
                    l++;
                    r = l+1;
                }
                else {
                    r++;
                }

        }

         result = new int[] { l+1, r+1 };
        return result;

    }
}
