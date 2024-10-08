class Solution {
    public int countDistinctIntegers(int[] nums) {
      Set<Integer> sol = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            sol.add(nums[i]);
            int rev = 0;
            while(nums[i]!=0){
                int rem = nums[i]%10;
                rev = rev * 10 + rem;
                nums[i] = nums[i]/10;
            }
            sol.add(rev);
            
        }
        return sol.size();
    }
}