class Solution {
    public int appendCharacters(String s, String t) {
int cnt = 0, l = 0, r = 0;
int n = t.length();

while (r < n && l < s.length()) {

    while (l < s.length() && s.charAt(l) != t.charAt(r)) {
        l++;
    }

    if (l < s.length()) {
        cnt++;
        l++;
        r++;
    }
}

return n - cnt;
    }
}