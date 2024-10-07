class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int sol = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(i+1<nums.length){
                    if(nums[i+1]==nums[i]){
                        ++count;

                    }
                    else{
                        if(count>max){
                            sol = nums[i];
                            max = count;
                        }
                        count = 1;
                    }
                }
                else{
                    if(count>max){
                            sol = nums[i];
                            max = count;
                        }
                        count = 1;

                }
            }
        }
        return sol;
    }
}