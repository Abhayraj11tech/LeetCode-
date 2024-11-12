class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);  
        int count = 0;
        int i = 0;
        
        while (i < target || (i - target) % 2 != 0) {
            count++;
            i += count;
        }
        
        return count;
    }
}
