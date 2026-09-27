class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = m + n - 1, left = m - 1, idx = n - 1;

        while (left >= 0 && idx >= 0) {
            if (nums1[left] > nums2[idx]) {
                nums1[right] = nums1[left];
                left--;
            } else {
                nums1[right] = nums2[idx];
                idx--;
            }
            right--;
        }

        while (idx >= 0) {
            nums1[right] = nums2[idx];
            idx--;
            right--;
        }
    }
}