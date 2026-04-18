class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (int i = 0 ; i < words.length ; i++){
            
            for (int j = 0 ; j < words.length ; j++){

                if (words[i] != words[j] && words[i].length() < words[j].length()) {
                    
                    if(isSubstring(words[i], words[j])) {
                        res.add(words[i]);
                        break;
                    }

                }

            }

        }

        return res;

    }

   public boolean isSubstring(String s1, String s2) {
    return s2.contains(s1);
}

}