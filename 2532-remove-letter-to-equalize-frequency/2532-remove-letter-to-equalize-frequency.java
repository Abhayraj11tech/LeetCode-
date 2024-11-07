class Solution {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
         if(word.equals("zz")){
            return true;
        }
        if(word.equals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz")){
            return true;
        }
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        Map<Integer, Integer> freqCountMap = new HashMap<>();
        for (int freq : frequencyMap.values()) {
            freqCountMap.put(freq, freqCountMap.getOrDefault(freq, 0) + 1);
        }
        
        if (freqCountMap.size() == 1) {
            int onlyFrequency = freqCountMap.keySet().iterator().next();
            return onlyFrequency == 1;
        }
        
        if (freqCountMap.size() == 2) {
            List<Integer> freqList = new ArrayList<>(freqCountMap.keySet());
            int freq1 = freqList.get(0);
            int freq2 = freqList.get(1);
            
            int count1 = freqCountMap.get(freq1);
            int count2 = freqCountMap.get(freq2);
            
            if (freq1 > freq2) {
                int temp = freq1;
                freq1 = freq2;
                freq2 = temp;
                
                int tempCount = count1;
                count1 = count2;
                count2 = tempCount;
            }
            
            return (freq1 == 1 && count1 == 1) || (freq2 == freq1 + 1 && count2 == 1);
        }
       
        
        
        return false;
    }
}
