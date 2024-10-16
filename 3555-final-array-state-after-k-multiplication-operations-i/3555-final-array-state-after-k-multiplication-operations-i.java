class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int [] sol = new int[nums.length];
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<min){
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] = nums[idx]*multiplier;

        }
        return nums;
    }
}