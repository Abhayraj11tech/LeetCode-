import java.util.ArrayList;

class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            ArrayList<Integer> current = new ArrayList<>();
            int currentGCD = 0;

            for (int end = start; end < nums.length; end++) {
                current.add(nums[end]);
                currentGCD = gcd(currentGCD, nums[end]);

                if (currentGCD == k) {
                    count++;
                }

                if (currentGCD < k) {
                    break;
                }
            }
        }

        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
