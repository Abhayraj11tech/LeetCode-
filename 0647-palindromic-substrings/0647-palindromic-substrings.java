class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            count += expand(s, i, i);    
            count += expand(s, i, i + 1); 
        }
        
        return count;
    }

    private int expand(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}
