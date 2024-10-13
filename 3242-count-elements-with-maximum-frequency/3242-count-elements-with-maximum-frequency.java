class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int res = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i+1]==nums[i]){
                ++count;
            }
            else{
                if(count>max){
                    res = count;
                    max = count;
                }
                count = 1;   
            }
        }
        int elm = 1;
        int dt = 0;
        for(int i=0;i<nums.length;i++){

        if(i+1<nums.length && nums[i+1]==nums[i]){
                ++elm;
            }
            else{
                if(elm==res){
                    ++dt;
                }
                elm = 1;
            }
        }
        return dt*res;
    }
}