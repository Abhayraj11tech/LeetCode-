import java.util.ArrayList;

class Solution {
    public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            arr.add(nums[i][i]);
            if (i != n - i - 1) {
                arr.add(nums[i][n - i - 1]);
            }
        }

        int sol = 0;
        for (int val : arr) {
            if (val <= 1) continue;
            if (val == 2 || val == 3) {
                sol = Math.max(sol, val);
                continue;
            }
            if (val % 2 == 0 || val % 3 == 0) continue;
            
            boolean isPrime = true;
            for (int j = 5; j * j <= val; j += 6) {
                if (val % j == 0 || val % (j + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sol = Math.max(sol, val);
            }
        }

        return sol;
    }
}
