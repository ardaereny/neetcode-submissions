class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int left = m - 1;
        int idx = n - 1;
        int right = m + n - 1;

        while (idx >= 0) {
            if (left >= 0 && nums1[left] > nums2[idx]) {
                nums1[right] = nums1[left];
                left--;
            } else {
                nums1[right] = nums2[idx];
                idx--;
            }

            right--;
        }
    
    }
}