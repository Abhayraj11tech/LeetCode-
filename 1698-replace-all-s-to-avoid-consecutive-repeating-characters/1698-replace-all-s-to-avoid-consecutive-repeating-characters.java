class Solution {
    public String modifyString(String s) {
        String add = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sol = new StringBuilder(s);
        int p = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '?') {
                char c = add.charAt(p);
                while ((i - 1 >= 0 && sol.charAt(i - 1) == c) || 
                       (i + 1 < s.length() && s.charAt(i + 1) == c)) {
                    p = (p + 1) % add.length();
                    c = add.charAt(p);
                }
                sol.setCharAt(i, c);
            }
        }
        
        return sol.toString();
    }
}
