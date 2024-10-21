class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int val = nums[i];
            while(val!=0){
                int rem = val%10;
                sum += rem;
                val = val/10;
            }
            min = Math.min(sum,min);
        }
        return min;
    }
}