class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] sol = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int val = 0;
            for(int j=start;j<=end;j++){
                val ^= arr[j];
            }
            sol[i] = val;
        }
        return sol;

    }
}