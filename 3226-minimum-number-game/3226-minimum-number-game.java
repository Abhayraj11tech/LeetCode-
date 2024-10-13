class Solution {
    public int[] numberGame(int[] nums) {
        int [] sol = new int[nums.length];
        Arrays.sort(nums);
        int count = 0;
        int p = 1;
        int q = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                sol[i] = nums[p];
                count = 1;
                p = p+2;
            }
            else{
                sol[i] = nums[q];
                count = 0;
                q = q+2;
            }
        }
        return sol;
    }
}