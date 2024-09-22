class Solution {
    public int kthSmallest(int[][] matrix, int k) {
          ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr.add(matrix[i][j]);
            }}

            Collections.sort(arr);
            int sol = arr.get(k-1);
            return sol;
    }}
                