class Solution {
    public static int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n + 1) / 2;
        long oddCount = count(4, odd, MOD);
        long evenCount = count(5, even, MOD);
        return (int) ((oddCount * evenCount) % MOD);
    }

    public static long count(int base, long exp, int MOD) {
        if (exp == 0)
            return 1;
        long half = count(base, exp / 2, MOD);
        half = (half * half) % MOD;
        if (exp % 2 != 0)
            half = (half * base) % MOD;
        return half;
    }
}