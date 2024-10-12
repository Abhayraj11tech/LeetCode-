class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int sol = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i],nums[j])){
                    int val = nums[i] ^ nums[j];
                    if(val>max){
                        sol = val;
                        max = val;
                    }
                }
            }
        }
        return sol;
    }
}