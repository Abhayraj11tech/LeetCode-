class Solution {
    public int missingNumber(int[] nums) {
        int sol = -1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                sol = i;
                break;
            }
        }
        if(sol == -1){
            return (nums[nums.length-1]+1);
        }
        else{
            return sol;
        }
    }
}