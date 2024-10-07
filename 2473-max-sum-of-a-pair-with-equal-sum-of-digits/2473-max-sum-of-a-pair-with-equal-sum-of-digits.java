class Solution {
    public int maximumSum(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            int sum = digitSum(num);
            if (map.containsKey(sum)) {
                max = Math.max(max, map.get(sum) + num);
            }
            map.put(sum, Math.max(map.getOrDefault(sum, 0), num));
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}