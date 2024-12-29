class Solution {
    public int maxSubArray(int[] nums) {
        int val = 0;
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                flag = true;
                break;
            }
        }
        if(flag){ 
        for(int i=0;i<nums.length;i++){
            val += nums[i];
            if(val<0){
                val = 0;
            }
            max = Math.max(max,val);
        }
        return max;
        }
        else{
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
    }
}