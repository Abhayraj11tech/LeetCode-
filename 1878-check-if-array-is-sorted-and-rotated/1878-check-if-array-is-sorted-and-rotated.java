class Solution {
    public boolean check(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        if (Arrays.equals(copy, nums)) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (copy[j] == nums[i]) {
                    set.add((j - i + nums.length) % nums.length);
                }
            }
        }
        return set.size() <= 1;
    }
}
