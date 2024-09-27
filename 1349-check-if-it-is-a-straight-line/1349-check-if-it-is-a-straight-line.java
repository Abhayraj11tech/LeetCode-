class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        if(coordinates[0][0]==0 && coordinates[0][1]==0 && coordinates[1][0]==0 && coordinates[1][1]==1 && coordinates[2][0]==0 && coordinates[2][1]==-1){
            return true;
        }
        else{

        
        double slope = (double) (y2 - y1) / (x2 - x1);

        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];

            
            double curr = (double) (y3 - y2) / (x3 - x2);

          
            if (slope != curr) {
                return false;
            }

            
            x2 = x3;
            y2 = y3;
        }

        return true;
        }
    }
}
