class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int countOne = 0;
            for (int j = 0; j < n; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    countOne++;
                }
            }
            sum += countOne * (n - countOne);
        }
        return sum;
    }
}
