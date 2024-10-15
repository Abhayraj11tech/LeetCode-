class Solution {
    public void nextPermutation(int[] nums) {
        int val = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                val = i - 1;
                break;
            }
        }
        if (val == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        for (int i = nums.length - 1; i > val; i--) {
            if (nums[i] > nums[val]) {
                swap(nums, i, val);
                break;
            }
        }
        
        reverse(nums, val + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
