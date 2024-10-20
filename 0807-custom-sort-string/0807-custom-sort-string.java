class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sol = new StringBuilder();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        for (char c : order.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                sol.append(String.valueOf(c).repeat(freq[c - 'a']));
                freq[c - 'a'] = 0;
            }
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq[c - 'a'] > 0) {
                sol.append(String.valueOf(c).repeat(freq[c - 'a']));
            }
        }
        
        return sol.toString();
    }
}
