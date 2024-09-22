class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          List<Integer> sol = new ArrayList<Integer>(); 
          Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
          if((i+1)<nums.length){
            if(nums[i+1]==nums[i]){
                sol.add(nums[i]);
            }
          }
               
        }
        return sol;
    }
}