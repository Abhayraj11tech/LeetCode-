class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder s1 = new StringBuilder(Integer.toString(start, 2));
        StringBuilder s2 = new StringBuilder(Integer.toString(goal, 2));
        
        while (s1.length() < s2.length()) {
            s1.insert(0, '0');
        }
        while (s2.length() < s1.length()) {
            s2.insert(0, '0');
        }
        
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ++count;
            }
        }
        return count;
    }
}
