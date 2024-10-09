class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] sol = new long[nums.length];
        long[] conversionArray = new long[nums.length];
        
        int max = nums[0];
        conversionArray[0] = nums[0] + max;
        sol[0] = conversionArray[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            conversionArray[i] = nums[i] + max;
            sol[i] = sol[i - 1] + conversionArray[i];
        }
        
        return sol;
    }
}
