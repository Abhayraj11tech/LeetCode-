import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }

        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);

        for (int i = 0; i < 32; i++) {
            int powerOf2 = 1 << i;
            char[] powerOf2Digits = String.valueOf(powerOf2).toCharArray();
            Arrays.sort(powerOf2Digits);
            if (Arrays.equals(digits, powerOf2Digits)) {
                return true;
            }
        }
        
        return false;
    }
}
