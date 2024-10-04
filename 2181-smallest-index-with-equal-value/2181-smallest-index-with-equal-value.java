class Solution {
    public int smallestEqual(int[] nums) {
        int sol = -1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                sol = i;
                break;
            }
        }
        return sol;
    }
}