class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<Double>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int val = nums[i] + nums[nums.length - 1 - i];
            double sol = (double) val / 2;
           
            set.add(sol);
        }
        return set.size();
    }
}