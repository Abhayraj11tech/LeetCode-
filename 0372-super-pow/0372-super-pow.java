class Solution {
    public int superPow(int a, int[] b) {
        a %= 1337;
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        }
        int res = 1;
        int mod = 1337;
        for (int i = 0; i < b.length; i++) {
            res = modPow(res, 10, mod);
            res = (res * modPow(a, b[i], mod)) % mod;
        }
        return res;
    }

    private int modPow(int base, int exp, int mod) {
        int result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
