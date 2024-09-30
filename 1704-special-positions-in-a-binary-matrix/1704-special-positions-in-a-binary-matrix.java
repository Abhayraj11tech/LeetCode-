class Solution {
    public int numSpecial(int[][] mat) {
       int count = 0;
        for(int i=0;i<mat.length;i++){
               boolean flag = true;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                     
                    for(int a=0;a<mat.length;a++){
                        if(a!=i && mat[a][j]==1){
                           
                            flag = false;
                            break;
                        }
                    }
                
                    for(int b=0;b<mat[i].length;b++){
                        if(b!=j && mat[i][b]==1){
                            flag = false;
                            break;
                        }
                    
                    }
                     
                
                if(flag == true){
                    ++count;
                    
                }
                    
                }
            }
           
        }
          
        return count;
    }
}