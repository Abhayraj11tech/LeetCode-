class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> elm = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
      int[] sol = new int[k];
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    ++count;
                }
            }
            elm.add(count);
            idx.add(count);
          
        }
        Collections.sort(elm);
        for(int i=0;i<k;i++){
            int val = elm.get(i);
            int res = idx.indexOf(val);
            sol[i] = res;
            elm.set(i,Integer.MAX_VALUE);
            idx.set(res,Integer.MAX_VALUE);

        }
        return sol;



    }
}