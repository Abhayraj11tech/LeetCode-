class Solution {
    public int numberOfChild(int n, int k) {
        int val = 2 * (n - 1);
        int pos = k % val;
        
        if (pos < n) {
            return pos;
        } else {
            return val - pos;
        }
    }
}
