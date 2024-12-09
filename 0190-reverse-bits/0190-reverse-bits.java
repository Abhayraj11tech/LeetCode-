public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        while (str.length() < 32) {
            str = "0" + str;
        }
        String sol = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sol += str.charAt(i);
        }
        return Integer.parseUnsignedInt(sol, 2);
    }
}
