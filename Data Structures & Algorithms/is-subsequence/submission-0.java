class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;

        for (char c : s.toCharArray()) {
            while (idx < t.length() && c != t.charAt(idx)) {
                idx++;
            }

            if (idx == t.length()) {
                return false; 
            }

            idx++; 
        }

        return true;
    }
}
