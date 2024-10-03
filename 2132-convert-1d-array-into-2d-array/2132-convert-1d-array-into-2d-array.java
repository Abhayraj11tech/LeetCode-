class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int [][] sol = new int[m][n];
        if(m*n == original.length){
        int p = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sol[i][j] = original[p++];
            }
            }
        return sol;
        }
        else{
           int[][] val = new int[0][0];
           return val;

        }
        
    }
}