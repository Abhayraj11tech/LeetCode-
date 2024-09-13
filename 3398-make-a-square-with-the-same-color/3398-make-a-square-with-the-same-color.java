class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int countB = 0;
                int countW = 0;
                for (int x = i; x < i + 2; x++) {
                    for (int y = j; y < j + 2; y++) {
                        if (grid[x][y] == 'B') {
                            countB++;
                        } else {
                            countW++;
                        }
                    }
                }
                if (countB >= 3 || countW >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
