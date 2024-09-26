class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int istart = 0;
        int dstart = s.length();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                res[i] = istart++;
            } else {
                res[i] = dstart--;
            }
        }
        res[s.length()] = istart; 

        return res;
    }
}
