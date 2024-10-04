import java.util.Arrays;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        int idx = Arrays.binarySearch(nums, original);
        if (idx >= 0) {
           
            while (idx >= 0) {
                original *= 2;
                idx = Arrays.binarySearch(nums, original);
            }
            return original;
        } else {
          
            return original;
        }
    }
}
