class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sol = 0;
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> val = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                val.add(grid[i][j]);
            }
            Collections.sort(val);
            temp.add(val);
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < temp.size(); j++) {
                max = Math.max(max, temp.get(j).get(i));
            }
            sol += max;
        }
        return sol;
    }
}
