class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] sol = new int[grid[0].length]; 
        for (int j = 0; j < grid[0].length; j++) { 
            int max = 0;
            for (int i = 0; i < grid.length; i++) { 
                String str = Integer.toString(grid[i][j]);
                max = Math.max(max, str.length()); 
            }
            sol[j] = max; 
        }
        return sol;
    }
}
