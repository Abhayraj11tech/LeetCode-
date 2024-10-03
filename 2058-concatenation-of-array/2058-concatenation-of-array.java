class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] sol = new int[2*nums.length];
        int p =0;
        for(int i=0;i<2*nums.length;i++){
            if(i<nums.length){
                sol[i] = nums[i];
            }
            if(i>=nums.length){
                sol[i] = nums[p++];
            }
        }
        return sol;
    }
}