import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> won = new HashSet<>();
        Map<Integer, Integer> f = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            won.add(matches[i][0]);
            f.put(matches[i][1], f.getOrDefault(matches[i][1], 0) + 1);
        }

        List<Integer> sol1 = new ArrayList<>();
        for (int player : won) {
            if (!f.containsKey(player)) {
                sol1.add(player);
            }
        }

        List<Integer> sol2 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
            if (entry.getValue() == 1) {
                sol2.add(entry.getKey());
            }
        }

        Collections.sort(sol1);
        Collections.sort(sol2);

        List<List<Integer>> sol = new ArrayList<>();
        sol.add(sol1);
        sol.add(sol2);

        return sol;
    }
}
