class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int val = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            val += i * nums[i];
        }

        int max = val;

        for (int k = 1; k < n; k++) {
            val = val + sum - n * nums[n - k];
            max = Math.max(max, val);
        }

        return max;
    }
}
