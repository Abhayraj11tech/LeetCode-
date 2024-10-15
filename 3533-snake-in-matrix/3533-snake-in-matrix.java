class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int mat[][] = new int[n][n];
        int p = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = p++;
            }
        }
        int q = 0;
        int a = 0,b=0;
        int sol = mat[0][0];
        for(int i=0;i<commands.size();i++){
                        String command = commands.get(i);
               if (command.equals("RIGHT")) {
                if (b < n ) { 
                    b++;
                }
            } else if (command.equals("LEFT")) {
                if (b >= 0) { 
                    b--;
                }
            } else if (command.equals("UP")) {
                if (a >= 0) { 
                    a--;
                }
            } else if (command.equals("DOWN")) {
                if (a < n ) { 
                    a++;
                }
            }
            sol = mat[a][b];
        }
        
        return sol;
    }
}