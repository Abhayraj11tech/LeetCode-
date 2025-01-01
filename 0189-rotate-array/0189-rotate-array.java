class Solution {
    public void rotate(int[] nums, int k) {
   
        int [] data = Arrays.copyOf(nums,nums.length);
        k = k % nums.length;
        int p = 0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[p++] = data[i];
        }
        for(int i=0;i<nums.length-k;i++){
            nums[p++] = data[i];
        }

    }
}