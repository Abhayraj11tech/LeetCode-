
class Solution {

    private Map<Integer, Map<Integer, Integer>> getPlayerColorFrequencyMap(int[][] pick) {
        Map<Integer, Map<Integer, Integer>> playerColorFrequencyMap = new HashMap<>();

        for (int[] entry : pick) {
            int player = entry[0];
            int color = entry[1];
            
            playerColorFrequencyMap
                .computeIfAbsent(player, k -> new HashMap<>())
                .put(color, playerColorFrequencyMap.get(player).getOrDefault(color, 0) + 1);
        }

        return playerColorFrequencyMap;
    }

    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> playerColorFrequencyMap = getPlayerColorFrequencyMap(pick);
        int count = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> colorFrequency = playerColorFrequencyMap.getOrDefault(i, new HashMap<>());
            boolean wins = false;

            for (int frequency : colorFrequency.values()) {
                if (frequency > i) {
                    wins = true;
                    break;
                }
            }

            if (wins) {
                ++count;
            }
        }

        return count;
    }

  }