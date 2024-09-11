public class Solution {
    public boolean checkValidString(String s) {
        int left = 0, max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
                max++;
            } else if (c == ')') {
                left--;
                max--;
            } else {
                left--;
                max++;
            }
            if (max < 0) return false;
            if (left < 0) left = 0;
        }
        
        return left == 0;
    }
}
