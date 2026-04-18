class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        int idx = 11;

        for (String s : details) {
            int temp = 0;
            for (int i = 0 ; i < 2 ; i++) {

                int digit = s.charAt(idx+i) -  '0';

                temp  = temp * 10 + digit;

            }

            if(temp > 60) {
                res++;
            }
        }

        return res;
    }
}