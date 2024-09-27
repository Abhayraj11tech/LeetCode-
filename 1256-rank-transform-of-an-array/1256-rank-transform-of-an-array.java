import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
    
        Set<Integer> uniqueElementsSet = new HashSet<>();
        for (int num : arr) {
            uniqueElementsSet.add(num);
        }
        List<Integer> uniqueElements = new ArrayList<>(uniqueElementsSet);
        Collections.sort(uniqueElements);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : uniqueElements) {
            rankMap.put(num, rank);
            rank++;
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
