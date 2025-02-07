class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        ArrayList<Integer> sol = new ArrayList<>();
        HashMap<Integer, Integer> val = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int dist = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0], color = queries[i][1];

            if (val.containsKey(ball)) {
                int prev = val.get(ball);
                count.put(prev, count.get(prev) - 1);
                if (count.get(prev) == 0) {
                    dist--;
                }
            }

            val.put(ball, color);
            count.put(color, count.getOrDefault(color, 0) + 1);
            if (count.get(color) == 1) {
                dist++;
            }

            sol.add(dist);
        }

        return sol.stream().mapToInt(i -> i).toArray();
    }
}
