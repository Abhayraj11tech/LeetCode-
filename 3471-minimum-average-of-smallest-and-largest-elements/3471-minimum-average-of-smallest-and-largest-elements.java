class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < nums.length/2; i++) {
           double val = (nums[i] + nums[nums.length-1-i]) / 2.0;
                if (val < min) {
                    min = val;
                }
            }
        
        return min;
    }
}
