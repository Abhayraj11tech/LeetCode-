class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sol = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += k) {
            String substring = s.substring(i, i + k);
            int sum = 0;
            
            for (int j = 0; j < substring.length(); j++) {
                sum += (substring.charAt(j) - 'a');
            }
            
            sum = sum % 26;
            
            sol.append((char)('a' + sum));
        }
        
        return sol.toString();
    }
}
