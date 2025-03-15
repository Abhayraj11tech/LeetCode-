class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            boolean chk = true;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    ++count;
                }
                else{
                    if(chk){
                        chk = false;
                    }
                    else{
                        break;
                    }
                }
            }
            if(chk){
                --count;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}