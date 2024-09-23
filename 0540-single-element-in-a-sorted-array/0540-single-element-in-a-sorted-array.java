class Solution {
    public int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);
        int sol = -1;
        for(int i=0;i<nums.length;i=i+2){
            if(i+1<nums.length){
            if(nums[i+1]!=nums[i]){
                sol = nums[i];
                break;
            }
            
            }
        }
        if(sol==-1){
            sol = nums[nums.length-1];
        }
        return sol;
    }
}