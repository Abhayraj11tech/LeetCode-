class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right){ 
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    sol.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    while(left < right && nums[left] == nums[left+1]){
                        ++left;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        --right;
                    }
                    ++left; 
                    --right; 
                }
                else if(sum > 0){
                    --right;
                }
                else{
                    ++left;
                }
            }
        }
        return sol;
    }
}
