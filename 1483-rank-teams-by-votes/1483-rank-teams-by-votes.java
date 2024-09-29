import java.util.*;

class Solution {
    public String rankTeams(String[] votes) {
        Map<Character, int[]> frequencyMap = new HashMap<>();
        int numTeams = votes[0].length();

        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char team = vote.charAt(i);
                frequencyMap.putIfAbsent(team, new int[numTeams]);
                frequencyMap.get(team)[i]++;
            }
        }

        List<Character> teams = new ArrayList<>(frequencyMap.keySet());

        Collections.sort(teams, (a, b) -> {
            for (int i = 0; i < numTeams; i++) {
                if (frequencyMap.get(a)[i] != frequencyMap.get(b)[i]) {
                    return frequencyMap.get(b)[i] - frequencyMap.get(a)[i];
                }
            }
            return a - b;
        });

        StringBuilder sol = new StringBuilder();
        for (char team : teams) {
            sol.append(team);
        }

        return sol.toString();
    }
}
