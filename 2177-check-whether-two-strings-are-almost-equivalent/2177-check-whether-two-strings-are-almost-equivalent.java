import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();
        
        for (char c : word1.toCharArray()) {
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : word2.toCharArray()) {
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }
        
        Set<Character> allChars = new HashSet<>(frequencyMap1.keySet());
        allChars.addAll(frequencyMap2.keySet());
        
        for (char c : allChars) {
            int freq1 = frequencyMap1.getOrDefault(c, 0);
            int freq2 = frequencyMap2.getOrDefault(c, 0);
            if (Math.abs(freq1 - freq2) > 3) {
                return false;
            }
        }
        
        return true;
    }
}
