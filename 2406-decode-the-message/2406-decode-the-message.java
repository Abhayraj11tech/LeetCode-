import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        String str = "abcdefghijklmnopqrstuvwxyz";
        char val = 'a';
        
        for (int i = 0; i < key.length(); i++) {
            char k = key.charAt(i);
            if (k != ' ' && !map.containsKey(k)) {
                map.put(k, val);
                val++;
            }
        }
        
        String sol = "";
        for (int i = 0; i < message.length(); i++) {
            char m = message.charAt(i);
            if (m == ' ') {
                sol += " ";
            } else {
                sol += map.get(m);
            }
        }
        
        return sol;
    }
}
