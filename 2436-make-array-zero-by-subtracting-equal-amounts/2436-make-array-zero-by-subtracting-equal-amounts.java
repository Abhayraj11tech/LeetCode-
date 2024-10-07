class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && (!arr.contains(nums[i]))){
                arr.add(nums[i]);
                ++count;
            }
        }
        return count;
    }
}