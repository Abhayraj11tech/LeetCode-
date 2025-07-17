class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int r = matrix.length;
        int c = matrix[0].length;
        int[] height = new int[c];
        int max = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < c; i++) {
                height[i] = (row[i] == '1') ? height[i] + 1 : 0;
            }

            for (int i = 0; i < c; i++) {
                int minH = height[i];
                for (int j = i; j < c; j++) {
                    minH = Math.min(minH, height[j]);
                    int area = minH * (j - i + 1);
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }
}
