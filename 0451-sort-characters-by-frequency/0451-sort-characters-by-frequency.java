class Solution {
    public String frequencySort(String s) {
      
           char[] arr = s.toCharArray();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : arr) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

    
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

       
        StringBuilder sol = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                sol.append(entry.getKey());
            }
        }

        return sol.toString();
    }
}
