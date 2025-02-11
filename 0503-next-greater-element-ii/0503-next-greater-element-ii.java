class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int elm = -1;
            boolean flag = false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    sol[i] = nums[j];
                    flag = true;
                    break;
                }
            }
            if(!flag){
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                    sol[i] = nums[k];
                    flag = true;
                    break;
                }
                }
            }
            if(!flag){
                sol[i] = -1;
            }
        }
        return sol;
    }
}