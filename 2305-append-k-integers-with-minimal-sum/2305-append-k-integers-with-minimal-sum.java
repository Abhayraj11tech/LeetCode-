class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        long current = 1;

        for (int num : nums) {
            if (num > current) {
                long gap = num - current;
                if (gap <= k) {
                    sum += (current + num - 1) * gap / 2; 
                    k -= gap;
                    current = num + 1;
                } else {
                    sum += (current + current + k - 1) * k / 2; 
                    return sum;
                }
            }
            current = Math.max(current, num + 1);
        }

        sum += (current + current + k - 1) * k / 2;
        return sum;
    }
}
