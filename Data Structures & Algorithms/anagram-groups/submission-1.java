class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<String, Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {
            HashMap<String, Integer> tempMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                String c = String.valueOf(s.charAt(i));

                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            map.computeIfAbsent(tempMap, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
