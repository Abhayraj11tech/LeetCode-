class Solution {
    public int[] twoSum(int[] nums, int target) {
    
     int [] sol = new int[2];
     for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length && j!=i;j++){
            if(nums[i]+nums[j]==target){
                sol[0] = i;
                sol[1] = j;
                return sol;
            }
        }
     }
     sol[0] = -1;
     sol[1] = -1;
     return sol;
}
}