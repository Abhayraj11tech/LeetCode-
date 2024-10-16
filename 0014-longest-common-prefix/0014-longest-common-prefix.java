class Solution {
    public String longestCommonPrefix(String[] strs) {
        
         Arrays.sort(strs);
        String sol = strs[0]; 
        String res = "";
        int p = 0;
        for (p = 0; p < sol.length(); p++) {
            char c = sol.charAt(p);

            for (int i = 1; i < strs.length; i++) {
   
                if (p >= strs[i].length() || strs[i].charAt(p) != c) {
                   
                    return sol.substring(0, p);
                }
            }
        }
        
        
       
        return sol;
    }
}
