class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> sol = new ArrayList<Integer>(); 
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    ++count;
                }
            }
            if(count>nums.length/3){
                if(!sol.contains(nums[i])){
                    sol.add(nums[i]);
                }
            }
        }
        return sol;
    }
}