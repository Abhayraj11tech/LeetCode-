class Solution {
    public boolean isSubsequence(String s, String t) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char cmp = s.charAt(i);
            
            int idx = t.indexOf(cmp, val);
            
            if (idx == -1) {
                return false;
            }
            
           val = idx + 1;
        }
        return true;
    }
}
