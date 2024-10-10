class Solution {
    public int maximum69Number(int num) {
        StringBuilder sol = new StringBuilder(String.valueOf(num));
        
        for (int i = 0; i < sol.length(); i++) {
            if (sol.charAt(i) == '6') {
                sol.setCharAt(i, '9');
                break; 
            }
        }
        
        return Integer.parseInt(sol.toString());
    }
}
