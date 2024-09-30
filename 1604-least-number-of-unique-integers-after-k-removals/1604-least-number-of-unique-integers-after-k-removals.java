class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));
        minHeap.addAll(frequencyMap.keySet());

        while (k > 0 && !minHeap.isEmpty()) {
            int num = minHeap.poll();
            int freq = frequencyMap.get(num);
            if (freq <= k) {
                k -= freq;
            } else {
                minHeap.add(num); 
                break;
            }
            }

        return minHeap.size();
    }
   
        


    
}