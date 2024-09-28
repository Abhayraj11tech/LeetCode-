class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            int len = 0;
            int val = nums[i];
            while(val!=0){
                int rem = val%10;
                ++len;
                val = val/10;
            }
            if(len%2==0){
                ++count;
            }
        }
        return count;
    }
}