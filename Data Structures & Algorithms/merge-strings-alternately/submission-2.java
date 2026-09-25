class Solution {
  public String mergeAlternately(String word1, String word2) {
    int min = Math.min(word1.length(), word2.length());
    char[] chars = new char[word1.length() + word2.length()];

    for (int i = 0; i < min; i++) {
        chars[2 * i] = word1.charAt(i);
        chars[2 * i + 1] = word2.charAt(i);
    }

    int index = 2 * min;
    String longer = word1.length() > word2.length() ? word1 : word2;

    for (int i = min; i < longer.length(); i++) {
        chars[index++] = longer.charAt(i);
    }

    return new String(chars);
}
}