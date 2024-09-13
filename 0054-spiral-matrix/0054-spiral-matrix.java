class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol = new ArrayList<>();
        int count = 0;
        int start = matrix.length;
        int end = matrix[0].length;
        int total = start * end;
        int startR = 0;
        int startC = 0;
        int endR = start - 1;
        int endC = end - 1;
        
        while(count < total) {
            for(int i = startC; count < total && i <= endC; i++) {
                sol.add(matrix[startR][i]);
                ++count;
            }
            startR++;
            
            for(int i = startR; count < total && i <= endR; i++) {
                sol.add(matrix[i][endC]);
                ++count;
            }
            endC--;
            
            for(int i = endC; count < total && i >= startC; i--) {
                sol.add(matrix[endR][i]);
                ++count;
            }
            endR--;
            
            for(int i = endR; count < total && i >= startR; i--) {
                sol.add(matrix[i][startC]);
                ++count;
            }
            startC++;
        }
        return sol;
    }
}
