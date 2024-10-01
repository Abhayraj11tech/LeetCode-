class Solution {
    public int subsetXORSum(int[] nums) {
        int sol = 0;
        sol = subsetXORHelper(nums, 0, 0);
        return sol;
    }

    private int subsetXORHelper(int[] nums, int i, int curr) {
        if (i == nums.length) {
            return curr;
        }

        int include = subsetXORHelper(nums, i + 1, curr ^ nums[i]);
        int exclude = subsetXORHelper(nums, i + 1, curr);

        return include + exclude;
    }
}
