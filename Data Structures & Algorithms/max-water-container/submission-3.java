class Solution {
    public int maxArea(int[] heights) {
        int temp = 0;
        int l = 0;
        int r = heights.length - 1;

        for (int i = 0; i < heights.length; i++) {

            
        int area = Math.min(heights[l], heights[r]) * (r - l);

            if (temp < area) {
                temp = area;
            }

            if (heights[l] >= heights[r]) {
                r--;
            } else {
                l++;
            }

        }

        return temp;
    }
}
