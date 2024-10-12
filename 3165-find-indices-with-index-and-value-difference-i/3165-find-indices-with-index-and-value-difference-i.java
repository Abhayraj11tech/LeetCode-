class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int [] sol = {-1,-1};
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDifference){
                    if(Math.abs(nums[i]-nums[j])>=valueDifference){
                            sol[0] = i;
                            sol[1] = j;
                            flag = true;
                            break;
                    }
                }
            }
            if(flag==true){
                break;
            }
        }
        return sol;
        
    }
}