class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        int count = 0;
        
        int left = 0;
        int right = n / 2;

  
        while (left < n / 2 && right < n) {
            if (2 * nums[left] <= nums[right]) {
                count += 2;
                left++;
            }
            right++;
        }
        
        return count;
    }
}