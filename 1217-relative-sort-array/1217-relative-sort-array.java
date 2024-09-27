import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int num : arr1) {
            f.put(num, f.getOrDefault(num, 0) + 1);
        }

        List<Integer> sol = new ArrayList<>();
        for (int num : arr2) {
            if (f.containsKey(num)) {
                int count = f.get(num);
                for (int i = 0; i < count; i++) {
                    sol.add(num);
                }
                f.remove(num);
            }
        }

        List<Integer> remainingList = new ArrayList<>();
        for (int num : f.keySet()) {
            int count = f.get(num);
            for (int i = 0; i < count; i++) {
                remainingList.add(num);
            }
        }
        
        Collections.sort(remainingList);
        sol.addAll(remainingList);

        return sol.stream().mapToInt(i -> i).toArray();
    }
}
