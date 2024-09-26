class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int sol = -1;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                if(arr[i+1]<arr[i]){
                    sol = i;
                    break;
                }
            }
        }
        return sol;
    }
}