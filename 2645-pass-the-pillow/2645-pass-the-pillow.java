class Solution {
    public int passThePillow(int n, int time) {
        int k = time / (n - 1); 
        int mod = time % (n - 1); 

        boolean flag = (k % 2 == 0);

        if (flag) {
            return mod + 1;
        } else {
            return n - mod;
        }
    }
}