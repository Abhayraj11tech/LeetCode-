class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];
        int sum = 0, prefixSum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < n; i++) {
            sol[i] = i * nums[i] - prefixSum + (sum - prefixSum - nums[i] * (n - i));
            prefixSum += nums[i];
        }

        return sol;
    }
}
