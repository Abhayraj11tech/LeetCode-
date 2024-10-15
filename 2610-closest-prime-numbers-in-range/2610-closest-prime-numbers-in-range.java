class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> sol = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                sol.add(i);
            }
        }

        if (sol.size() < 2) {
            return new int[] {-1, -1};
        }

        int[] ans = new int[2];
        int minDiff = Integer.MAX_VALUE;

        for (int k = 1; k < sol.size(); k++) {
            int diff = sol.get(k) - sol.get(k - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = sol.get(k - 1);
                ans[1] = sol.get(k);
            }
        }
        
        return ans;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
