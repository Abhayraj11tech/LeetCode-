import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            
            if (key == 'b') {
                b = value;
            } else if (key == 'a') {
                a = value;
            } else if (key == 'l') {
                l = value / 2;
            } else if (key == 'o') {
                o = value / 2;
            } else if (key == 'n') {
                n = value;
            }
        }

        int[] arr = {b, a, l, o, n};
        int minCount = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minCount) {
                minCount = arr[i];
            }
        }
        return minCount;
    }
}
