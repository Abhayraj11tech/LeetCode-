class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);
        int max = Integer.MIN_VALUE;
        int sol = -1;
        for(int i=0;i<divisors.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0){
                    ++count;
                }
            }
            if(count>max){
                sol = divisors[i];
                max = count;

            }
        }
        return sol;
    }
}