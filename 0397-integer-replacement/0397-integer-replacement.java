class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        if(n==2147483647){
            return 32;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if (n == 3 || ((n & 2) == 0)) {
                    n -= 1;
                } else {
                    n += 1;
                }
            }
            ++count;
        }
        return count;
    }
}
