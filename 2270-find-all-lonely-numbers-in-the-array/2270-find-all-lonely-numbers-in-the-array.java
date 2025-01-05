class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

 
        for (int num : nums) {
            if (count.get(num) == 1 && 
                !count.containsKey(num - 1) && 
                !count.containsKey(num + 1)) {
                sol.add(num);
            }
        }

        return sol;
    }
}
