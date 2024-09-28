class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> result1 = new HashSet<>(set1);
        result1.removeAll(set2);

        Set<Integer> result2 = new HashSet<>(set2);
        result2.removeAll(set1);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(result1));
        answer.add(new ArrayList<>(result2));

        return answer;
    }}