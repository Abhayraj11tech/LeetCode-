class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                if (flag) {
                    return false;
                }
                flag = true;
            }
        }
        
        if (s.length() > 0 && s.charAt(s.length() - 1) == '1' && flag) {
            return false;
        }
        
        return true;
    }
}
