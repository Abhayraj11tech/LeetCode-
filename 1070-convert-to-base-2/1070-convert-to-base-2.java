class Solution {
    public String baseNeg2(int n) {
        if (n == 0){
            return "0";
        }
        
        String sol = "";
        while (n != 0) {
            int rem = n % -2;
            n /= -2;
            
            if (rem < 0) {
                rem += 2;
                n += 1;
            }
            
            sol = rem + sol;
        }
        
        return sol;
    }
}
