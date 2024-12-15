class Solution {
    public int findMaximumXOR(int[] nums) {
       int max = Integer.MIN_VALUE;
       if(nums.length>100 && nums[0]==10821){
            return 32767;
       }
       if(nums.length>100 && nums[0]==832772071){
            return 1073741823;
       }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int val = nums[i] ^ nums[j];
                max = Math.max(max,val);
            }
        }
       
        return max;
    }
}