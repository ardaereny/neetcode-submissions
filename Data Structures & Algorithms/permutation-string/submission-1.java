class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> compareMap = new HashMap<>();

        int left = 0;
        int n = s1.length();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < s2.length(); right++) {
            if (right - left >= n) {
                int count = compareMap.get(s2.charAt(left)) - 1;
                if (count == 0) {
                    compareMap.remove(s2.charAt(left));
                } else {
                    compareMap.put(s2.charAt(left), count);
                }
                left++;
            }

            compareMap.put(s2.charAt(right), compareMap.getOrDefault(s2.charAt(right), 0) + 1);

            if (map.equals(compareMap)) {
                return true;
            }
        }

        return false;
    }
}
