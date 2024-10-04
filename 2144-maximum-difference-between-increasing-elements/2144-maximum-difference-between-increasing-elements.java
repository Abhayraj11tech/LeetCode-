class Solution {
    public int maximumDifference(int[] nums) {
        int sol = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    int val = nums[j] - nums[i];
                    if(val>max){
                        sol = val;
                        max = val;
                    }
                }
            }
        }
        return sol;
    }
}