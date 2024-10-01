class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int val1 = nums[nums.length-1] * nums[nums.length-2];
        int val2 = nums[0] * nums[1];
        return val1 - val2;
    }
}