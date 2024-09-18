class Solution {
    public int singleNumber(int[] nums) {
        int sol = -1;
        for(int i=0;i<nums.length;i++){
              int count = 0;
            for(int j=0;j<nums.length;j++){
              
                if(nums[j]==nums[i]){
                    ++count;
                }
            }
            if(count<3){
                sol = nums[i];
                break;
            }
        }
        return sol;
    }
}