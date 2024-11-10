class Solution {
    public int possibleStringCount(String word) {
        int sol = 1;
        int i = 0;
        
        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            
            int len = j - i;
            sol += len - 1;
            i = j;
        }
        
        return sol;
    }
}