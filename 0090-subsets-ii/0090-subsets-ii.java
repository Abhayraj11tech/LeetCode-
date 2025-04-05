class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(sol, new ArrayList<>(), nums, 0);
        return sol;
    }

    private void backtrack(List<List<Integer>> sol, List<Integer> temp, int[] nums, int start) {
        sol.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backtrack(sol, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
