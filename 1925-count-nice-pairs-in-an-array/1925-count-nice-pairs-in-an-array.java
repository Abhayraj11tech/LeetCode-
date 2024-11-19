class Solution {
    public int countNicePairs(int[] nums) {
        int mod = 1_000_000_007;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int sol = 0;

        for (int num : nums) {
            int revNum = reverse(num);
            int diff = num - revNum;

            sol = (sol + freqMap.getOrDefault(diff, 0)) % mod;
            freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
        }

        return sol;
    }

    private int reverse(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(sb.reverse().toString());
    }
}
