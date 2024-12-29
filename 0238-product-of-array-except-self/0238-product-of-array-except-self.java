class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        boolean flag = false;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ++count;
                flag = true;
            }
            else{ 
                pro *= nums[i];
            }
        }
        int sol[] = new int[nums.length];
        if(count>=2){
            for(int i=0;i<nums.length;i++){
                sol[i] = 0;
            }
            return sol;
        }
        else{ 
        if(flag){
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
                sol[i] = pro;
           }
           else{
                sol[i] = 0;
           }
         }
        }
        else{
           for(int i=0;i<nums.length;i++){
            sol[i] = pro/nums[i];
         }
        }
        return sol;
      
        }

    }
}
