class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;
        
        for (int k = 1; k * (k - 1) / 2 < n; k++) {
            int val = n - k * (k - 1) / 2;
            if (val % k == 0) {
                count++;
            }
        }
        
        return count;
    }
}
