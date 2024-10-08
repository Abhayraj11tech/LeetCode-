class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> primes = new HashSet<>();
        
        for (int num : nums) {
            int n = num;
            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    primes.add(i);
                    n /= i;
                }
            }
            if (n > 1) {
                primes.add(n);
            }
        }
        
        return primes.size();
    }
}