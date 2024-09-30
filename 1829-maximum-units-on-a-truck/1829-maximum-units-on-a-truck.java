class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int maxSum = 0;
        int remainingTruckSize = truckSize;

        for (int[] box : boxTypes) {
            int boxesTaken = Math.min(remainingTruckSize, box[0]);
            maxSum += boxesTaken * box[1];
            remainingTruckSize -= boxesTaken;

            if (remainingTruckSize == 0) {
                break; 
            }
        }

        return maxSum;
        
    }
}