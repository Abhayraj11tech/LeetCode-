class Solution {
    public int[] sumZero(int n) {
        int[] sol = new int[n];
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sol[i] = i + 1;
            sum += sol[i];
        }
        
        sol[n - 1] = -sum;
        return sol;
    }
}
