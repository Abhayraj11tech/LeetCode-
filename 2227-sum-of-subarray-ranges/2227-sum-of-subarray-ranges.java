class Solution {
    public long subArrayRanges(int[] nums) {
        return getSumOfSubarrayMax(nums) - getSumOfSubarrayMin(nums);
    }

    private long getSumOfSubarrayMax(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();
        int[] ple = new int[n]; 
       int[] nle = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * ple[i] * nle[i];
        }
        return sum;
    }

    private long getSumOfSubarrayMin(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();
        int[] ple = new int[n];
        int[] nle = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * ple[i] * nle[i];
        }
        return sum;
    }
}
