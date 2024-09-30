class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p = 1;
        int count = 0;
        int sol = -1;
        for(int i=0;i<arr.length;i=i+0){
            if(arr[i]!=p){
                ++count;
                if(count==k){
                    sol = p;
                    break;
                }
            }
            else{
                ++i;
            }
            ++p;
        }
        if(count<k){
            for(int j=arr[arr.length-1]+1;j<Integer.MAX_VALUE;j++){
                ++count;
                if(count==k){
                    sol = j;
                    break;
                }
            }
        }
        return sol;
    }
}