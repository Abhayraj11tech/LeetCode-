class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long x = 0;
        long curr = n;
        int sum = digitSum(curr);

        if (sum <= target) {
            return 0;
        }

        long val = 1;

        while (sum > target) {
            long rem = curr % 10;
            long add = (10 - rem) % 10;
            x += add * val;
            curr += add;
            val *= 10;
            curr /= 10; 
            sum = digitSum(curr);
        }

        return x;
    }

    private int digitSum(long num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
