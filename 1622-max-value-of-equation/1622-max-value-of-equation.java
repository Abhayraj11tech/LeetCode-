class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            while (!q.isEmpty() && points[i][0] - points[q.peek()][0] > k)
                q.poll();
            if (!q.isEmpty())
                ans = Math.max(ans, points[i][0] + points[i][1] + points[q.peek()][1] - points[q.peek()][0]);
            while (!q.isEmpty() && points[q.peekLast()][1] - points[q.peekLast()][0] < points[i][1] - points[i][0])
                q.pollLast();
            q.addLast(i);
        }
        return ans;
    }
}
