class Solution {
    public int repeatedNTimes(int[] nums) {
        int repeat = nums.length/2;
        Arrays.sort(nums);
    int sol = -1;
        for(int i=0;i<nums.length;i++){
                   int count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    ++count;
                }
                else{
                    break;
                }
            }
            if(count==repeat){
                sol = nums[i];
                break;
            }
        }
        return sol;
    }
}