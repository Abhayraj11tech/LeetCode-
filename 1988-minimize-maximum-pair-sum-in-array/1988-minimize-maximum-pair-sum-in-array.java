class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = nums[i] + nums[nums.length-1-i];
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}