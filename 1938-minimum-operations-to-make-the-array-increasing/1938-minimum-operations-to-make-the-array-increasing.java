class Solution {
    public int minOperations(int[] nums) {
        int sol = 0;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
                if(nums[i+1]>nums[i]){
                    continue;
                }
                else{
                    while(nums[i+1]<=nums[i]){
                        ++sol;
                        nums[i+1] = nums[i+1] + 1;
                    }
                    
                }
            }
        }
        return sol;
    }
}