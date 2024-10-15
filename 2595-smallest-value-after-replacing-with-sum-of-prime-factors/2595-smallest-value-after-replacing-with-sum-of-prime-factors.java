class Solution {
    public int smallestValue(int n) {
        while (true) {
            int sum = 0;
            int val = n;
            int i = 2;

            while (i * i <= n) {
                while (n % i == 0) {
                    sum += i;
                    n /= i;
                }
                i++;
            }
            if (n > 1) {
                sum += n;
            }

            n = sum;
            if (n == val) {
                return n;
            }
        }
    }
}
