class Solution {
    public int compress(char[] chars) {
        
    int slow = 0;
    int fast = 0;

    while (fast < chars.length) {
        int count = 0;
        char current = chars[fast];
        while (fast < chars.length && current == chars[fast]) {
            fast++;
            count++;
        }

        chars[slow++] = current;

        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[slow++] = c;
            }
        }

    }
    return slow;
    }
}