class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // her harf için sayım
            
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // frekans dizisini string olarak kullan
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append('#'); // ayırıcı
                keyBuilder.append(num);
            }
            String key = keyBuilder.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
    
}
