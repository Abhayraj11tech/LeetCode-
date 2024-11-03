class Solution {
    public String maxValue(String n, int x) {
         char xChar = (char) (x + '0');
        
        StringBuilder sol = new StringBuilder();
        boolean flag = false;
        
        if (n.charAt(0) == '-') {
            sol.append('-');
            for (int i = 1; i < n.length(); i++) {
                if (!flag && n.charAt(i) > xChar) {
                    sol.append(xChar);
                    flag = true;
                }
                sol.append(n.charAt(i));
            }
            
            if (!flag) {
                sol.append(xChar);
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                if (!flag && n.charAt(i) < xChar) {
                    sol.append(xChar);
                    flag = true;
                }
                sol.append(n.charAt(i));
            }
            
            if (!flag) {
                sol.append(xChar);
            }
        }
        
       return sol.toString();
    }
}