import java.util.*;

class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        int numWords = words.length;
        for (int freq : frequencyMap.values()) {
            if (freq % numWords != 0) {
                return false;
            }
        }
        
        return true;
    }
}
