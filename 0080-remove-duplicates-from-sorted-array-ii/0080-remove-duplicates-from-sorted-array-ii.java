import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int k = 0; 

        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            if (count < 2) {
                map.put(num, count + 1); 
                nums[k] = num; 
                k++;
            }
        }
        return k; 
    }
}
