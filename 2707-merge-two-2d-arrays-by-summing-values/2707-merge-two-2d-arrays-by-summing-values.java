
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

     
        for (int[] pair : nums1) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

  
        for (int[] pair : nums2) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

        List<int[]> mergedList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            mergedList.add(new int[]{entry.getKey(), entry.getValue()});
        }

       
        mergedList.sort((a, b) -> Integer.compare(a[0], b[0]));

        int[][] sol = new int[mergedList.size()][2];
        for (int i = 0; i < mergedList.size(); i++) {
            sol[i] = mergedList.get(i);
        }

        return sol;
    }

}
