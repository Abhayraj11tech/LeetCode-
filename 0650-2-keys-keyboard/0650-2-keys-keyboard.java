class Solution {
    public int minSteps(int n) {
        if (n == 1){
            return 0;
        }
        
        int sol = 0;
        int val = 2;
        
        while (n > 1) {
            while (n % val == 0) {
                sol += val;
                n /= val;
            }
            val++;
        }
        
        return sol;
    }
}