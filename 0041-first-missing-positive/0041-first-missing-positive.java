class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int val = -1;
        int count = 1;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                 flag = true;
                if(nums[i]>count){
                    return count;
                }
                else if(nums[i]==count){
                    ++count;
                }
            }
        }
        if(!flag){
            return 1;
        }
        else{
            return nums[nums.length-1]+1;
        }
    }
}