import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> elm= new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 2) {
                elm.add(entry.getKey());
            }
        }

        for (int i=0;i<elm.size();i++) {
            sum = sum ^ elm.get(i);
        }

        return sum;
    }
}
