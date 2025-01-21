class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int evenSum = 0, oddSum = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int leftEven = 0, leftOdd = 0, count = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum -= nums[i];
            } else {
                oddSum -= nums[i];
            }
            
            if (leftEven + oddSum == leftOdd + evenSum) {
                count++;
            }
            
            if (i % 2 == 0) {
                leftEven += nums[i];
            } else {
                leftOdd += nums[i];
            }
        }
        
        return count;
    }
}
