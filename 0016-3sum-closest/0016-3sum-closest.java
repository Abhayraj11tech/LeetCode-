class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sol = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum; 
                }
                
                if (Math.abs(sum - target) < Math.abs(sol - target)) {
                    sol = sum; 
                }
                
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return sol;
    }
}
