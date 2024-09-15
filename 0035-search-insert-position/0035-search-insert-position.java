class Solution {
    public int searchInsert(int[] nums, int target) {
        int sol = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                sol = i;
                break;
            }
        }
        if(sol==-1){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]>target){
                        sol = j;
                        break;
                    }
                    
                }
        }
        if(sol==-1){
            sol = nums.length;
        }
        return sol;
    }
}