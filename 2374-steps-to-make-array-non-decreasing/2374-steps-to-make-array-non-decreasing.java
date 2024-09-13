class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Stack<int[]> stk = new Stack<>();
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int curr = 0;
            
            while (!stk.isEmpty() && stk.peek()[0] <= nums[i]) {
                curr = Math.max(curr, stk.pop()[1]);
            }
            
            if (!stk.isEmpty()) {
                curr++;
            }
            
            count = Math.max(count, curr);
            stk.push(new int[]{nums[i], curr});
        }
        
        return count;
    }
}
