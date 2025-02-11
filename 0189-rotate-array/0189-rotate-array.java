class Solution {
    public void rotate(int[] nums, int k) {
        int [] copy = Arrays.copyOf(nums,nums.length);
        k = k % nums.length;
        int p = 0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[p++] = copy[i];
        }
        for(int j=0;j<nums.length-k;j++){
            nums[p++] = copy[j];
        }
    }
}