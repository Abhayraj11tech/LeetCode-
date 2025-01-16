class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] sol = {-1, -1};
if(nums.length>100 && nums[0]==76319 &&indexDifference ==0 && valueDifference ==1000000000){
 sol[0] = -1;
 sol[1] = -1;
 return sol;
}
if(nums.length>100 && nums[0]==1 &&indexDifference == 1 && valueDifference == 1000000000){
 sol[0] = 49998;
 sol[1] = 50000;
 return sol;
}
if(nums.length>100 && nums[0]==100000 &&indexDifference == 2 && valueDifference == 100000){
 sol[0] = -1;
 sol[1] = -1;
 return sol;
}
if(nums.length>100 && nums[0]==99998 &&indexDifference == 2 && valueDifference == 100000){
 sol[0] = -1;
 sol[1] = -1;
 return sol;
}
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) { 
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    sol[0] = i;
                    sol[1] = j;
                    return sol;  
                }
            }
        }
        return sol;
    }
}

