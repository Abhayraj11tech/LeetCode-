import java.util.*;

class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int num : arr) {
            f.put(num, f.getOrDefault(num, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(f.values());
        Collections.sort(frequencies, Collections.reverseOrder());

        int count = 0;
        int sum = 0;
        int cmp = arr.length / 2;

        for (int freq : frequencies) {
            sum += freq;
            count++;
            if (sum >= cmp) {
                break;
            }
        }

        return count;
    }
}
