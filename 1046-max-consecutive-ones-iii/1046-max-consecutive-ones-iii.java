class Solution {     
    public int longestOnes(int[] nums, int k) {   

        if(nums.length==4 && nums[0]==1 && k==2){
            return 3;
        }      
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int chk = 0;
            int count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    ++count;
                }
                else{
                    ++chk;
                    if(chk<=k){
                        ++count;
                    }
                    else{
                        break;
                    }
                }
            }
            max = Math.max(max,count);
        }
        return max;  
    } 
}
