import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for (List<Integer> interval : nums) {
            int start = interval.get(0);
            int end = interval.get(1);
            for (int point = start; point <= end; point++) {
                set.add(point);
            }
        }
        return set.size();
    }
}
