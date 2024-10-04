class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean flag = true;
        int cmp = grid.length - 1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==j ||  (i+j)==cmp){
                    if(grid[i][j]==0){
                        flag = false;
                        break;
                    }
                }
                else{
                    if(grid[i][j]!=0){
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}