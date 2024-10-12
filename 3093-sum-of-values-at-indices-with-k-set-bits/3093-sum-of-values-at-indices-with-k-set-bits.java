class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sol = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int index = i;
            while (index > 0) {
                if ((index & 1) == 1) {
                    ++count;
                }
                index >>= 1;
            }
            if (count == k) {
                sol += nums.get(i);
            }
        }
        return sol;
    }
}
