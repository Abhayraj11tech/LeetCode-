class Solution {
    public int findPeakElement(int[] nums) {
       int [] b = nums.clone();
        Arrays.sort(nums); 
        int max = nums[nums.length-1];
        int i = 0;
        int sol = 0;
         while (i < nums.length) { 
  
            if (b[i] == max) { 
                sol = i;
                break;
            } 
            else { 
                i = i + 1; 
            } 
        } 
        
        
        if(nums.length==1 || sol<0){
            sol = 0;
        }
        return sol;

    }
}