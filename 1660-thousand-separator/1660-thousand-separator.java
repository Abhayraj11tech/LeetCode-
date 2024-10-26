class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sol = new StringBuilder();
        String str = Integer.toString(n);
        int count = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (count == 3 && i != str.length() - 1) {
                sol.append(".");
                count = 0;
            }
            sol.append(str.charAt(i));
            count++;
        }
        
        return sol.reverse().toString();
    }
}
