class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        while(arr.size() != 1) {
            ArrayList<Integer> val = arr;
            arr = new ArrayList<>();
            for(int i = 0; i < val.size() - 1; i++) {
                arr.add((val.get(i) + val.get(i + 1)) % 10);
            }
        }
        return arr.get(0);
    }
}
