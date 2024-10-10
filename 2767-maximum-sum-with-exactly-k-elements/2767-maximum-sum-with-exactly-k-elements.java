class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = nums[nums.length-1];
        int val = nums[nums.length-1];
        for(int i=0;i<k-1;i++){
            ++val;
            sum += val;
        }
        return sum;
    }
}