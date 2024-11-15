class Solution {
    public boolean isPerfectSquare(int num) {
        boolean flag = false;
        if(num==1){
            return true;
        }
        else{ 
        
        long l = 2, r = num / 2, mid, val;
        while (l <= r) {
            mid = l + (r - l) / 2;
            val = mid * mid;
            if (val == num) {
                return true;
            } else if (val < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        
        return false;
        }
    }
}