import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> sol = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int cmp= nums.length;

        for (int[] array : nums) {
            for (int num : array) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == cmp) {
                sol.add(entry.getKey());
            }
        }

        Collections.sort(sol);
        
        return sol;
    }
}
