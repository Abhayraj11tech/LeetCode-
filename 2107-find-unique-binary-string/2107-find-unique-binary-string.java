import java.util.Arrays;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            String sol = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (Arrays.binarySearch(nums, sol) < 0) {
                return sol;
            }
        }
        return "";
    }
}
