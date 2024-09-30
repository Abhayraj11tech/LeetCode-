import java.util.*;

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] xor = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                xor[i][j] = matrix[i][j]
                    ^ (i > 0 ? xor[i-1][j] : 0)
                    ^ (j > 0 ? xor[i][j-1] : 0)
                    ^ (i > 0 && j > 0 ? xor[i-1][j-1] : 0);
            }
        }

        List<Integer> sol = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sol.add(xor[i][j]);
            }
        }

        Collections.sort(sol, Collections.reverseOrder());

        return sol.get(k - 1);
    }
}
