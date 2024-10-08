class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int sol = -1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<=0){
               break;
            }
            else{
                int val = -(nums[i]);
                int idx = Arrays.binarySearch(nums,val);
                if(idx>=0){
                    sol = nums[i];
                    break;
                }
            }
        }
        return sol;
    }
}