class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int sol = -1;
        int min = Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            int val = Math.abs(nums[i] - 0);
            if(val<min){
                sol = nums[i];
                min = val;
            }
        }
        return sol;
    }
}