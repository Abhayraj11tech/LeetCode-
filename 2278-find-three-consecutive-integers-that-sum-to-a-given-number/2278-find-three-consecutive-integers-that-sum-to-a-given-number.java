class Solution {
    public long[] sumOfThree(long num) {
        long [] sol = new long[3];
        if (num % 3 == 0) {
            long val = num / 3;
            sol[0] = val - 1;
            sol[1] = val;
            sol[2] = val + 1;
            return sol;
        }
        return new long[0];
    }
}
