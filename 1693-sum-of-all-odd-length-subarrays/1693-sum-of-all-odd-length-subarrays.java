class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int sol = 0;
        for(int i=0;i<arr.length;i++){
                sol += arr[i];
            int count = 1;
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                ++count;
                sum += arr[j];
                if(count%2!=0){
                    sol += sum;
                }
            }
        }
        return sol;
    }
}