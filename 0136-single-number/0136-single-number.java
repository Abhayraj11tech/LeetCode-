class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int sol =0 ;
        int res =0;
        if(nums.length==1){
            res = nums[0];
        }
        else{
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                
                if(nums[i]!=nums[j] && i!=j){
                        count++;
                        sol = nums[i];
                }
                

            }
         
            if(count==nums.length-1){
                res = sol;
                break; 
            }
            else{
                count  = 0;
                sol = 0;
                res = 0;
            }
        }
        }
        return res;
    
    }
}