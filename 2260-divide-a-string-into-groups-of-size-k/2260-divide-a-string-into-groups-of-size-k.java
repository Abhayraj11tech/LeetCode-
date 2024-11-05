class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length() + k - 1) / k;  
        String[] sol = new String[n];
        
        int p = 0;
        for (int i = 0; i < s.length(); i += k) {
            StringBuilder str = new StringBuilder();
            
            for (int j = i; j < i + k && j < s.length(); j++) {
                str.append(s.charAt(j));
            }
            
            while (str.length() < k) {
                str.append(fill);  
            }
            
            sol[p++] = str.toString();
        }
        
        return sol;
    }
}
