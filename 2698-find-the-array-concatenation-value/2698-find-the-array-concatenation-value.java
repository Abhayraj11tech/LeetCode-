class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long val = 0;  
        int n = nums.length;
        
        for (int i = 0; i < n / 2; i++) {
            String s1 = Integer.toString(nums[i]);
            String s2 = Integer.toString(nums[n - 1 - i]);
            String str = s1 + s2;
            val += Long.parseLong(str);
        }
        
 
        if (n % 2 != 0) {
            val += nums[n / 2];
        }
        
        return val;
    }

}
      