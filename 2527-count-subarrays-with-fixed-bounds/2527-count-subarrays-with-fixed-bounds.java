class Solution {
    public long countSubarrays(int[] nums, int min, int max) {
        long sol = 0;
        int val = -1, l = -1, r = -1;

        for (int i = 0; i < nums.length; ++i) {
            if (!(min <= nums[i] && nums[i] <= max)) {
                val = i;
            }

            if (nums[i] == min) {
                l = i;
            }

            if (nums[i] == max) {
                r = i;
            }

            sol += Math.max(0, Math.min(l, r) - val);
        }

        return sol;
    }
}
