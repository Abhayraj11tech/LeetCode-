class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sol = 0;
        long count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;  
                sol += count; 
            } else {
                count = 0;  
            }
        }

        return sol;
    }
}
