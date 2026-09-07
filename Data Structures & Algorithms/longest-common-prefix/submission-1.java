public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String referenceWord = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(referenceWord.length(), strs[i].length())) {
                if (referenceWord.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            referenceWord = referenceWord.substring(0, j);
        }
        return referenceWord;
    }
}