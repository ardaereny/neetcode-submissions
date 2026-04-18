class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            while (s.charAt(i) == ' ') {
                index--;
                i--;
            }

            if(i+1 != s.length() && s.charAt(i-1) == ' '){
                return index - i + 1;
            }
        }
        return s.length();
    }
}