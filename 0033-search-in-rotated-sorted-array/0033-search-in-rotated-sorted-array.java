class Solution {
    public int search(int[] nums, int target) {
        int sol = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                sol = i;
                break;
            }
        }
        return sol;
    }
}