class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int [] sol = new int[2];
        int p = 0;
        for(int i=0; i<nums.length-1;) { 
            if(nums[i+1] != nums[i]) {
                sol[p++] = nums[i];
                i = i + 1;
            } else {
                i = i + 2;
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]) {
            sol[p++] = nums[nums.length-1];
        }
        return sol;
    }
}
