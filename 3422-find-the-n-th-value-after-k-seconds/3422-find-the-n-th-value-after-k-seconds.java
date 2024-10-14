class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod = (int)(Math.pow(10,9)) + 7;
        int[] arr = new int[n];
        int[] sol = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        
        for (int l = 0; l < k; l++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = (sum + arr[j]) % mod;
                sol[j] = sum;
            }
           
            arr = sol.clone();
        }
        
        return sol[n-1];
    }
}
