class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int add = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            sum += nums[i];
            while(val!=0){
                int rem = val%10;
                add += rem;
                val =  val/10;
            }

        }
        int sol = Math.abs(sum-add);
        return sol;
    }
}