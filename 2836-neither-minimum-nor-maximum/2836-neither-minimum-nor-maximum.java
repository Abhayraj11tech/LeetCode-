class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length-2 <= 0){
            return -1;
        }
        else{ 
            Arrays.sort(nums);
          return nums[1];
        }
    }
}