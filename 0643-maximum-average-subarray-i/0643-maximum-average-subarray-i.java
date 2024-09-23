class Solution {
    public double findMaxAverage(int[] nums, int k) {
          
       double max = Integer.MIN_VALUE;
       double sol = 0;
        int n = nums.length;
        for(int i=0;i<=n-k;i++){
            int count = 0;
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                ++count;
                if(count==k){
                    break;
                }
            }
         
            if((double)sum/k > max){
                sol = (double)sum/k;
                max = sol;
            }
            
           
        }
       return sol;
      
    }
}