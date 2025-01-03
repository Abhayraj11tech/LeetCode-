class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> val = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (val.isEmpty() || val.get(val.size() - 1)[1] < start) {
                val.add(new int[]{start, end});
            } else {
                int[] arr = val.get(val.size() - 1);
                arr[1] = Math.max(arr[1], end);
            }
        }
        int[][] sol = new int[val.size()][2];
        for (int i = 0; i < val.size(); i++) {
            sol[i] = val.get(i);
        }
        return sol;
    }
}
