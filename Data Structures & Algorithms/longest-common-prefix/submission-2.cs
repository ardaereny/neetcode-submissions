public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        string referenceWord = strs[0];

        for (int i = 1; i < strs.Length; i++) {
            int j = 0;

            while (j < Math.Min(referenceWord.Length, strs[i].Length)) {
                if (referenceWord[j] != strs[i][j]) {
                    break;
                }

                j++;
            }

            referenceWord = referenceWord.Substring(0, j);
        }

        return referenceWord;
    }
}