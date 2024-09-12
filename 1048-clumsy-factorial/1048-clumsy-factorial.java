class Solution {
    public int clumsy(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 6;

        int val = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;

        while (n >= 4) {
            val -= n * (n - 1) / (n - 2) - (n - 3);
            n -= 4;
        }

        if (n == 3) val -= 6;
        else if (n == 2) val -= 2;
        else if (n == 1) val -= 1;

        return val;
    }
}
