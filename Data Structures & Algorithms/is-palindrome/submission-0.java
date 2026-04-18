class Solution {
    public boolean isPalindrome(String s) {
         int left = 0;
        int right = s.length() - 1;

        for (; left < right; ) {
            // Soldan geçersiz karakterleri atla
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Sağdan geçersiz karakterleri atla
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // İki karakter eşit değilse palindrome değildir
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
