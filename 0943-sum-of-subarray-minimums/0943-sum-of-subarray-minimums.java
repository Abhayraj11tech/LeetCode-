class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        int[] ple = new int[n]; 
        int[] nle = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        
        stack.clear();
    
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        long sol = 0;
        for (int i = 0; i < n; i++) {
            sol = (sol + (long) arr[i] * ple[i] * nle[i]) % mod;
        }

        return (int) sol;
    }
}
