class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod = 1000000007;
        long lcm = a * b / gcd(a, b);  
        long l = Math.min(a, b);
        long r = (long) Math.min(a, b) * n;

        while (l < r) {
            long m = l + (r - l) / 2;
            if (m / a + m / b - m / lcm >= n)
                r = m;
            else
                l = m + 1;
        }

        return (int) (l % mod);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
