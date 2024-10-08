class Solution {
    public int[] applyOperations(int[] nums) {
        int [] sol = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
                if(nums[i]==nums[i+1]){
                    nums[i] = 2*nums[i];
                    nums[i+1] = 0;
                }
                else{
                    nums[i] = nums[i];
                }
            }
        }
        int p = 0;
        int q = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0){
                sol[sol.length-1-p] = 0;
                ++p;
            }
            else{
                sol[q] = nums[i];
                ++q;
            }
        }
        return sol;
    }
}