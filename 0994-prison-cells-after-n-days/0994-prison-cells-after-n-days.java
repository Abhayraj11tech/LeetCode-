class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[] sol = new int[cells.length];
        n = (n - 1) % 14 + 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (j - 1 >= 0 && j + 1 < cells.length) {
                    sol[j] = cells[j - 1] == cells[j + 1] ? 1 : 0;
                } else {
                    sol[j] = 0;
                }
            }
            System.arraycopy(sol, 0, cells, 0, cells.length);
        }
        return cells;
    }
}
