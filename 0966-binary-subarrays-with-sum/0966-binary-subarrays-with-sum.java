class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sol = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    ++sol;
                }
            }
        }
        return sol;
    }
}
