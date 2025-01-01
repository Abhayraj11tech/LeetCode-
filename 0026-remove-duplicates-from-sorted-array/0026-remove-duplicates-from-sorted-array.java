class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        ArrayList<Integer> set = new ArrayList<>();
        int p = 0; 
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){ 
             set.add(nums[i]);
            }
        }
        for (int val : set) {
            nums[p++] = val;
        }

        return set.size();
    }
}
