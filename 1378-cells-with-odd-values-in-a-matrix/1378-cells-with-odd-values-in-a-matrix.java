class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        for (int i = 0; i < indices.length; i++) {
            row.add(indices[i][0]);
            col.add(indices[i][1]);
        }
        
        for (int i : row) {
            for (int j = 0; j < n; j++) {
                mat[i][j]++;
            }
        }
        
        for (int j : col) {
            for (int i = 0; i < m; i++) {
                mat[i][j]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
