class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

      
        for (int num : nums1) {
            set.add(num);
        }

        // Check if elements of nums2 are in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }}