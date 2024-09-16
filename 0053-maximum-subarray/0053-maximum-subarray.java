class Solution {
    public int maxSubArray(int[] nums) {
        int val = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            val += nums[i];
            max = Math.max(max,val);
            if(val<0){
                val = 0;
            }
        }
        return max;
    }
}