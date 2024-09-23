class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
          ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                num.add(mat[i][j]);
            }
        }
        
         int [][] sol = new int[r][c];
         if((r*c)!=num.size()){
            return mat;
         }
         else{
        int p =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sol[i][j] = num.get(p);
                ++p;
            }
        }
           return sol;
    }
    }
}