class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long n = (long) nums.length * (nums.length - 1) / 2;
        long good = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i] - i;
            good += freqMap.getOrDefault(val, 0);
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }

        return n - good;
    }
}