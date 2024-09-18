class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int sol = 0;
        int max = 0;
        if(nums.length>=2){
            for(int i=0;i<nums.length;i++){
                if(   ((i+1)<nums.length)  && (nums[i+1]-nums[i]>max)  ){
                        sol = nums[i+1]-nums[i];
                        max = sol;
                }
            }
        }
        return sol;

        
    }
}