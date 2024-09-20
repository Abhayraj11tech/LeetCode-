class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int sol = 0;
        for(int i=0;i<nums.length;i++){
            if((i+1)<nums.length && nums[i+1]==nums[i]){
                sol = nums[i];
                break;
            }
        }
        return sol;
    }
}