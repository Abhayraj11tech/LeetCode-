public class Solution {
    public int minimumChairs(String s) {
        int count = 0;
        int val = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                val++;
                count = Math.max(count, val);
            } else {
                val--;
            }
        }
        
        return count;
    }
   }