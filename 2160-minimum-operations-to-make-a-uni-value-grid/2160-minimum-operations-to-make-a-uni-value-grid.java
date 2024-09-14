class Solution {
    
    public int minOperations(int[][] grid, int x) {
        int n1 = grid.length;
        int n2 = grid[0].length;
        int arr[] = new int[n1*n2];
        int n = n1*n2;
        int idx = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int target = arr[n/2];
        
        int ans = 0;
        for(int i=0; i<n; i++){
            int diff = Math.abs(arr[i]-target);
            if(diff%x!=0){
                return -1;
            }
            else{
                ans += (diff/x);
            }
        }
        return ans;
    }
}