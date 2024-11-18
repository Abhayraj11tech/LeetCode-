class Solution {
    public int numWaterBottles(int numBottles, int num) {
        int total = numBottles;
        int val = numBottles;

        while (val >= num) {
            int newBottles = val / num;
            total += newBottles;
            val = val % num + newBottles;
        }

        return total;
    }
}
