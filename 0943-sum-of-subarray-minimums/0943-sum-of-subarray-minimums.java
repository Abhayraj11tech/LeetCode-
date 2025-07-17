public class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < n; ++i) {
            while (!s1.isEmpty() && arr[s1.peek()] > arr[i]) {
                s1.pop();
            }
            prev[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }

        for (int i = n - 1; i >= 0; --i) {
            while (!s2.isEmpty() && arr[s2.peek()] >= arr[i]) {
                s2.pop();
            }
            next[i] = s2.isEmpty() ? n : s2.peek();
            s2.push(i);
        }

        long res = 0;
        for (int i = 0; i < n; ++i) {
            long left = i - prev[i];
            long right = next[i] - i;
            res = (res + arr[i] * left * right) % MOD;
        }

        return (int) res;
    }
}
