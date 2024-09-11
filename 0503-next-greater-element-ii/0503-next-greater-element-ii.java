class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] sol = new int[nums.length];
        Arrays.fill(sol, -1);  
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) { 
                int index = (i + j) % nums.length;
                if (nums[index] > nums[i]) {
                    sol[i] = nums[index];
                    break;
                }
            }
        }
        
        return sol;
    }
}
