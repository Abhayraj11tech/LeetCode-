class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        
        int pro = 1;
        for (int i = 0; i < nums.length; i++) {
            sol[i] = pro;
            pro *= nums[i];
        }

        pro = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            sol[i] *= pro;
            pro *= nums[i];
        }
        
        return sol;
    }
}
