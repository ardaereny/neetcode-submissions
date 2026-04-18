class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

    int l = 0; 
    int r = 0; 

    while (l < word.length() && r < abbr.length()) {

        if (Character.isLetter(abbr.charAt(r))) {
            if (word.charAt(l) != abbr.charAt(r)) {
                return false;
            }
            l++;
            r++;
        } 
        else {

            if (abbr.charAt(r) == '0') {
                return false;
            }

            StringBuilder sb = new StringBuilder();

            while (r < abbr.length() && Character.isDigit(abbr.charAt(r))) {
                sb.append(abbr.charAt(r));
                r++;
            }

            int num = Integer.parseInt(sb.toString());
            l += num; 
        }
    }

    return l == word.length() && r == abbr.length();
}

 }