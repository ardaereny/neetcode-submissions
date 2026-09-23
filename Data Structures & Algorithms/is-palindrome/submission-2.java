class Solution {
 public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        String regulatedString = s.toLowerCase();

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(regulatedString.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(regulatedString.charAt(right))) {
                right--;
            }

            if (regulatedString.charAt(left) != regulatedString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
