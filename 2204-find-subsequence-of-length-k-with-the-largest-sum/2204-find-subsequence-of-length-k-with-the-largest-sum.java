class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        ArrayList<int[]> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(new int[]{nums[i], i});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        ArrayList<int[]> selected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            selected.add(arr.get(i));
        }

        selected.sort(Comparator.comparingInt(a -> a[1]));

        int[] sol = new int[k];
        for (int i = 0; i < k; i++) {
            sol[i] = selected.get(i)[0];
        }

        return sol;
    }
}
