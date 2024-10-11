class Solution {
    private static final int MOD = 1000000007;

    public int concatenatedBinary(int n) {
        long sol = 0;
        for (int i = 1; i <= n; i++) {
            String str = Integer.toBinaryString(i);
            sol = (sol << str.length()) + Integer.parseInt(str, 2); 
            sol %= MOD; 
        }
        return (int) sol; 
    }
}