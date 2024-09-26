class Solution {
    public int numFriendRequests(int[] ages) {
     Arrays.sort(ages);
        int sol = 0;

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 15) continue;

            int lowerBound = lowerBound(ages, 0.5 * age + 7);
            int upperBound = upperBound(ages, age);

            sol += upperBound - lowerBound - 1; 
        }

        return sol;
    }


    private int lowerBound(int[] ages, double age_min) {
        int left = 0, right = ages.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (ages[mid] <= age_min) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private int upperBound(int[] ages, int age_max) {
        int left = 0, right = ages.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (ages[mid] <= age_max) left = mid + 1;
            else right = mid;
        }
        return left;
    }

 }