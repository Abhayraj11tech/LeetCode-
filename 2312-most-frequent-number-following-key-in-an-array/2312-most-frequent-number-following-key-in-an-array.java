class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                count.put(target, count.getOrDefault(target, 0) + 1);
            }
        }
        
        int sol = -1;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                sol = entry.getKey();
            }
        }
        
        return sol;
    }
}
