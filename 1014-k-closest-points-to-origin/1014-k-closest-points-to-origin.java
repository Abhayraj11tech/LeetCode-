class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int d = x * x + y * y;

            pq.add(new Info(x, y, d));
        }

        int[][] sol = new int[k][2];
        for (int i = 0; i < k; i++) {
            Info info = pq.poll();
            sol[i][0] = info.a;
            sol[i][1] = info.b;
        }

        return sol;
    }

    static class Info implements Comparable<Info> {
        int a, b, d;

        Info(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }

        public int compareTo(Info i) {
            return this.d - i.d;
        }
    }
}
