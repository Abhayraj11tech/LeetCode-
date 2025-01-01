class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] sol = new int[num_people];
        int p = 1;

        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {
                if (candies >= p) {
                    sol[i] += p;
                    candies -= p;
                } else {
                    sol[i] += candies;
                    candies = 0;
                }
                p++;
            }
        }
        
        return sol;
    }
}
