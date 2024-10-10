
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        boolean added;

        do {
            List<Integer> row = new ArrayList<>();
            added = false;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > 0) {
                    row.add(entry.getKey());
                    countMap.put(entry.getKey(), entry.getValue() - 1);
                    added = true;
                }
            }
            if (added) {
                result.add(row);
            }
        } while (added);

        return result;
    }
}
