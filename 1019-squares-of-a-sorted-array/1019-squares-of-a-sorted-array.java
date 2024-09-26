class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sol[i] = (int)(Math.pow(nums[i],2));
        }
        Arrays.sort(sol);
        return sol;
    }
}