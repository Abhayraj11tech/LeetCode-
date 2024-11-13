class Solution {
    public int numSquares(int n) {
        return sol(n, new int[n + 1]);
    }

    private int sol(int num, int[] arr) {
        if (num == 0) return 0;
        if (arr[num] > 0) return arr[num];
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i * i <= num; i++) {
            int count = sol(num - i * i, arr) + 1;
            min = Math.min(min, count);
        }
        
        arr[num] = min;
        return min;
    }
}
