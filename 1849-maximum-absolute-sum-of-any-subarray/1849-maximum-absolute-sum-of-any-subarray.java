class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int max = 0;
        int min= 0;
        int cur_max = 0;
        int cur_min = 0;

        for (int i = 0; i < nums.length; i++) {
            
            cur_min += nums[i];
            min = Math.min(cur_min,min);
            
            if (cur_min > 0) {
                cur_min = 0;
            }

            cur_max +=  nums[i];
            max = Math.max(cur_max,max);
            
            if (cur_max < 0) {
                cur_max = 0;
            }

        }
        
        return Math.max(max,Math.abs(min));
    }
}