class Solution {
    public int[] sortArrayByParity(int[] nums) {
         int [] sol = new int[nums.length];
         int p =0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sol[p++] = nums[i];
            }
         }
           for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                sol[p++] = nums[i];
            }
         }
         return sol;
    }
}