class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        int sol = 0;

        for (int i = 0; i < nums1.length; i++) {
            long target = (long) nums1[i] * nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                for (int k = j + 1; k < nums2.length; k++) {
                    if ((long) nums2[j] * nums2[k] == target) {
                        sol++;
                    }
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            long target = (long) nums2[i] * nums2[i];
            for (int j = 0; j < nums1.length; j++) {
                for (int k = j + 1; k < nums1.length; k++) {
                    if ((long) nums1[j] * nums1[k] == target) {
                        sol++;
                    }
                }
            }
        }

        return sol;
    }
}
