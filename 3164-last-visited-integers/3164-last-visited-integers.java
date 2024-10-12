class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        int count = 0;
        
        for (int num : nums) {
            if (num >= 0) {
                seen.add(0, num);
                count = 0;
            } else {
                ++count;
                if (count - 1 < seen.size()) {
                    sol.add(seen.get(count - 1));
                } else {
                    sol.add(-1);
                }
            }
        }
        
        return sol;
    }
}
