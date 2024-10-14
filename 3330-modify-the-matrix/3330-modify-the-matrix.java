class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sol = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    int max = Integer.MIN_VALUE;
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][j] > max) {
                            max = matrix[k][j];
                        }
                    }
                    sol[i][j] = max;
                } else {
                    sol[i][j] = matrix[i][j];
                }
            }
        }
        return sol;
    }
}
