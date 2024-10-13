class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] sol = new int [2];
        int p =1;
        int miss = -1;
        int rep = -1;
        boolean flag = false;
        ArrayList<Integer> set = new ArrayList<>();
         ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    rep = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
                if(!arr.contains(grid[i][j])){ 
                arr.add(grid[i][j]);
                }
            }
        }
      
          Collections.sort(arr);
          for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=p){
                miss = p;
                break;
            }
            else{
                ++p;
            }
          }
          if(miss==-1){
            miss = arr.get(arr.size()-1) + 1;
          }
        
        sol[0] = rep;
        sol[1] = miss;
        return sol;
    }
}