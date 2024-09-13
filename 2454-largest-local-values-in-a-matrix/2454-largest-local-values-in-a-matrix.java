class Solution {
    public int[][] largestLocal(final int[][] grid) {
        final int n = grid.length;
        final int[][] result = new int[n - 2][n - 2];

        for(int i = 2; i < n; ++i)
            for(int j = 2; j < n; ++j)
                for(int p = i - 2; p <= i; ++p)
                    for(int q = j - 2; q <= j; ++q)
                        result[i - 2][j - 2] = Math.max(result[i - 2][j - 2], grid[p][q]);

        return result;
    }
}