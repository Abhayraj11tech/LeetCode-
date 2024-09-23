public class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        
        Set<Integer> seen = new HashSet<>();
        Set<Integer> sol = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num - k)) {
                sol.add(num - k);
            }
            if (seen.contains(num + k)) {
                sol.add(num);
            }
            seen.add(num);
        }
        
        return sol.size();
    }
}
