class Solution {
    public int[] getConcatenation(int[] nums) {
      ArrayList<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            for (int num : nums) {
                list.add(num);
            }

            int ans[] = list.stream().mapToInt(Integer::intValue).toArray();

            return ans;

        }

}