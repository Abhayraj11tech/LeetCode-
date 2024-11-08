class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int sol = 0;
       
        for (int i = 0; i < s.length(); i++) {
            int z = 0, o = 0;
            
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    z++;
                } else {
                    o++;
                }
       
                if (z <= k || o <= k) {
                    sol++;
                }
            }
        }
        
        return sol;
    }
}
