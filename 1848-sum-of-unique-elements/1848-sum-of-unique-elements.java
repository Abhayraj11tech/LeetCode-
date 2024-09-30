class Solution {
    public int sumOfUnique(int[] nums) {
        int sol = 0;
        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]==nums[i]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                sol += nums[i];
            }
        }
        return sol;
    }
}