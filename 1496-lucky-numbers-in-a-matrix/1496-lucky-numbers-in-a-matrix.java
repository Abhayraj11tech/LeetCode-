class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> small = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            small.add(min);
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length; row++) {
                max = Math.max(max, matrix[row][col]);
            }
            big.add(max);
        }

        for (int i = 0; i < small.size(); i++) {
            for (int j = 0; j < big.size(); j++) {
                if (big.get(j).equals(small.get(i))) {
                    sol.add(small.get(i));
                }
            }
        }

        return sol;
    }
}
