import java.util.HashMap;
import java.util.Map;

class Solution {
    public long sumDigitDifferences(int[] nums) {
        Map<Integer, Map<Integer, Integer>> val = new HashMap<>();
        long sol = 0;

        for (int num : nums) {
            String str = Integer.toString(num);
            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                val.putIfAbsent(i, new HashMap<>());
                val.get(i).put(digit, val.get(i).getOrDefault(digit, 0) + 1);
            }
        }

        for (int num : nums) {
            String str = Integer.toString(num);
            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                for (int d = 0; d <= 9; d++) {
                    if (d != digit) {
                        sol += val.getOrDefault(i, new HashMap<>()).getOrDefault(d, 0);
                    }
                }
            }
        }

        return sol / 2;
    }
}
