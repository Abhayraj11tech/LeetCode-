class Solution {
    public int[] replaceElements(int[] arr) {
        int [] sol = new int[arr.length];
        int p = 0;
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=i+1;j<arr.length;j++){
               max =  Math.max(max,arr[j]);
            }
            sol[p++] = max;
        }
        sol[arr.length-1] = -1;
        return sol;
    }
}