class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            long currentLCM = 1;

            for (int end = start; end < nums.length; end++) {
                currentLCM = lcm(currentLCM, nums[end]);

                if (currentLCM > k) {
                    break;
                }

                if (currentLCM == k) {
                    count++;
                }
            }
        }

        return count;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
