class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    private int atMostK(int[] nums, int k) {
        int sol = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                count++;
            }
            
            while (count > k) {
                if (nums[left] % 2 != 0) {
                    count--;
                }
                left++;
            }
            
            sol += right - left + 1;  
        }
        
        return sol;
    }
}
