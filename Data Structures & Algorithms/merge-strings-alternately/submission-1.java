class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l = 0, r = 0;

        int min = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(l));
            sb.append(word2.charAt(r));
            l++;
            r++;
        }

        sb.append(word1.substring(l));
        sb.append(word2.substring(r));

        return sb.toString();
    }
}
