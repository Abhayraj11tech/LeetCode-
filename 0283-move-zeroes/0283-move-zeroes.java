class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        int copy[] = Arrays.copyOf(nums,nums.length);
   for(int i=0;i<nums.length;i++){
       if(copy[i]!=0){
        nums[p++] = copy[i];
       }
    }
    while(p!=nums.length){
        nums[p++] = 0;
    }
    }
}