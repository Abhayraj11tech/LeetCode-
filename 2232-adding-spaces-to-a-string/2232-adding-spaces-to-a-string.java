class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sol = new StringBuilder();
        int p = 0; 
        int val = -1;

        for (int i = 0; i < s.length(); i++) {
            if (p < spaces.length) {
                val = spaces[p];
            }

            if (i == val) {
                sol.append(' '); 
                ++p; 
            }

            sol.append(s.charAt(i)); 
        }

        return sol.toString();
    }
}
