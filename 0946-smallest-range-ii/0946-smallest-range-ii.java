class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        int minVal = nums[0];
        int maxVal = nums[n - 1];
        int range1 = maxVal - minVal;
        int sol = range1;

        for (int i = 0; i < n - 1; i++) {
            int newMinVal = Math.min(nums[0] + k, nums[i + 1] - k);
            int newMaxVal = Math.max(nums[i] + k, nums[n - 1] - k);
            int val = newMaxVal - newMinVal;
            sol = Math.min(sol, val);
        }

        return sol;
    }
}
