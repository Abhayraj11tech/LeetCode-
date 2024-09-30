class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int sol = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sol += nums[i];
            } else {
                sol = nums[i];
            }
            sum = Math.max(sum, sol);
        }

        return sum;
    }
}
