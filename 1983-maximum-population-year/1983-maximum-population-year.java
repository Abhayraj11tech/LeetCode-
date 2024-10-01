class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] cng = new int[2051]; 

        for (int[] log : logs) {
            cng[log[0]]++; 
            cng[log[1]]--; 
        }

        int max = 0;
        int year = 0;
        int curr = 0;

        for (int y = 1950; y <= 2050; y++) {
            curr += cng[y];
            if (curr > max) {
                max = curr;
                year = y;
            }
        }

        return year;
    }
}
