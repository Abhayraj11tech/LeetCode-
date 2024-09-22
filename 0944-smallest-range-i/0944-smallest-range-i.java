class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
         int diff = max - min;
        
        return Math.max(0, diff - 2 * k);
    }
}