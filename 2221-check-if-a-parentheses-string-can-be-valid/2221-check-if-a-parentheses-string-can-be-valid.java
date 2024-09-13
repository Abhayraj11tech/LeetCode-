class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false;
        }
        
        int c = 0, res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                ++c;
            } else {
                ++res;
            }
            if (res > c) {
                return false;
            }
        }
        
        c = 0;
        res = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                ++c;
            } else {
                ++res;
            }
            if (res > c) {
                return false;
            }
        }
        
        return true;
    }
}
