class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] stp = new int[n + 1];
        stp[0] = 1; 
        stp[1] = 1; 
        for (int i = 2; i <= n; i++) {
            stp[i] = stp[i - 1] + stp[i - 2];
        }
        
    
        return stp[n];
    
        
    }}