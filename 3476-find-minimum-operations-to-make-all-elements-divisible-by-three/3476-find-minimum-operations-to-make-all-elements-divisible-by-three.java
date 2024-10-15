class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] % 3 != 0) {
                ++count;
                int diff = nums[i] % 3;
                if (Math.abs(0 - diff) < Math.abs(3 - diff)) {
                    nums[i] -= diff;  
                } else {
                    nums[i] += (3 - diff);  
                }
            }
        }
        return count;
    }
}
