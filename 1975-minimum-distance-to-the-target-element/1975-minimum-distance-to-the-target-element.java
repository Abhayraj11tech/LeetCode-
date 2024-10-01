class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        int sol = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int val = Math.abs(i-start);
                if(val<min){
                    sol = val;
                    min= val;
                }
            }
        }
        return sol;
        
        
    }
}