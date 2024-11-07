class Solution {
    public int beautifulSubstrings(String s, int k) {
        int sol = 0;
        String vow = "aeiou";
        
        for (int i = 0; i < s.length(); i++) {
            int v = 0;
            int c = 0;
            
            for (int j = i; j < s.length(); j++) {
                if (vow.indexOf(s.charAt(j)) != -1) {
                    v++;
                } else {
                    c++;
                }
                
                if (v == c && (v * c) % k == 0) {
                    sol++;
                }
            }
        }
        
        return sol;
    }
}
