class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i=0;i<nums.length;i++){
                if(i+1<nums.length && nums[i]>nums[i+1]){
                    flag1 = false;
                 }
                if(i+1<nums.length &&  nums[i]<nums[i+1]){
                    flag2 = false;
                }
            }
            
            
        
           
        if(flag1==true || flag2==true){
            return true;

        }
        else{
            return false;
        }
        }
}