class Solution {
    public int mySqrt(int x) {
        int left = 0 , right = x;
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long value = (long) mid * mid;
            if(value == x){
                return mid;
            }

            else if (value > x) {
                right = mid - 1;
            }

            else {
                res = mid;
                left = mid + 1;
            }
        }

        return res;
    }
}