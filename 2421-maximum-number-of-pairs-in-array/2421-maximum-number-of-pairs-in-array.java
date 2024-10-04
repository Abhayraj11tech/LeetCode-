class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        int left = 0;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){ 
            if(nums[i+1]==nums[i]){
                ++count;
            }
            else{
                int rem = count%2;
                int val = count/2;
                pair += val;
                left += rem;
                count = 1;
            }
            }
            else{
                int rem = count%2;
                int val = count/2;
                pair += val;
                left += rem;
                count = 1;
            }
        }
        int [] sol = {pair,left};
        return sol;
    }
}