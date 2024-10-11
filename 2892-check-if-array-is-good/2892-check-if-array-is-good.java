class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
       boolean flag = true;
        int p = 1;
        int val = nums[nums.length-1];

        
        if(nums.length<=val){
            return false;
        }
        else{ 
        for(int i=0;i<nums.length;i++){
           if(i != nums.length-1){
                if( nums[i] != p){
                        flag = false;
                        break;
                }
                else{
                    ++p;
                }
               
           }
           else{
                if(nums[i] != val){
                    flag = false;
                    break;
                }
                
           }
        }
       return flag;
        }
    }
}