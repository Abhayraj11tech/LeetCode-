class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        Set<Integer> frequencySet = new HashSet<>();
        for (int freq : frequencyMap.values()) {
            frequencySet.add(freq);
        }

        return frequencySet.size() == 1;
    }
}
