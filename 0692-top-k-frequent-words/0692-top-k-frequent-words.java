import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> sol = new ArrayList<>();
        Map<String, Integer> f = new HashMap<>();
        
        for (String word : words) {
            f.put(word, f.getOrDefault(word, 0) + 1);
        }
        
        List<String> kList = new ArrayList<>(f.keySet());
        Collections.sort(kList, (a, b) -> f.get(b).equals(f.get(a)) ? a.compareTo(b) : f.get(b) - f.get(a));
        
        for (int i = 0; i < k; i++) {
            sol.add(kList.get(i));
        }
        
        return sol;
    }
}
