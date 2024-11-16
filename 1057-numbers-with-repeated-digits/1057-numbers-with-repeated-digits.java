class Solution {
    public int numDupDigitsAtMostN(int n) {
        // Convert n to a list of digits
        List<Integer> digits = new ArrayList<>();
        int num = n + 1; // Include n itself
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        Collections.reverse(digits);

        int len = digits.size();
        int count = 0;

        // Count valid numbers with distinct digits (up to len-1 digits)
        for (int i = 1; i < len; i++) {
            count += 9 * perm(9, i - 1); // 9 choices for the first digit (1-9)
        }

        // Count valid numbers with len digits
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int digit = digits.get(i);
            for (int j = i == 0 ? 1 : 0; j < digit; j++) {
                if (!used.contains(j)) {
                    count += perm(9 - i, len - i - 1);
                }
            }
            if (used.contains(digit)) {
                break; // Stop if a repeated digit is encountered
            }
            used.add(digit);
        }

        return n - count;
    }

    // Compute permutations: nPr
    private int perm(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }
        return result;
    }
}
