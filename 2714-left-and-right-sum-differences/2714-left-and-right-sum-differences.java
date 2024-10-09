class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int left = 0;
            int right = 0;
            for(int j=i-1;j>=0;j--){
                left += nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                right += nums[k];
            }
            sol[i] = Math.abs(left-right);
        }
        return sol;
    }
}