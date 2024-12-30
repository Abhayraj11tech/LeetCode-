class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> val = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                ArrayList<Integer> l = new ArrayList<>();
                for (int m = i; m <= j; m++) {
                    l.add(nums[m]);
                }
                val.add(l);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < val.size(); i++) {
            int dt = 0;
            int count = 0;
            for (int elm : val.get(i)) {
                dt |= elm;
                ++count;
            }
            if (dt >= k) {
                min = Math.min(min, count);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
