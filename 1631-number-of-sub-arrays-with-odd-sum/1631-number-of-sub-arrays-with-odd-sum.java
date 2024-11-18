class Solution {
    public int numOfSubarrays(int[] arr) {
        long count=0;
        int sum=0;
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum%2==0){
                count+=odd;
                even++;
            }
            else{
                count+=even+1;
                odd++;
            }
        }
        
        return (int)(count%(1000000007));
    }
}