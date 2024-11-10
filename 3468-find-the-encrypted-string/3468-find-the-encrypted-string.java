 class Solution {
    public String getEncryptedString(String s, int k) {
        String sol = "";
        int length = s.length(); 
        
        for (int i = 0; i < length; i++) {
            int val = (i + k) % length; 
            
            sol += s.charAt(val);
        }
        
        return sol;
    }
 }
