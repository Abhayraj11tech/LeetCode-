class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder(s);
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i > 0) { 
                    str.deleteCharAt(i - 1);
                    str.deleteCharAt(i - 1);
                    i = Math.max(i - 2, -1);
                }
            }
        }
        
        return str.toString();
    }
}
