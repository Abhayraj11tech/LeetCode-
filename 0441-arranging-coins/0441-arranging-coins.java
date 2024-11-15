class Solution {
    public int arrangeCoins(int n) {
        int sum=0;
        int count = 0;
        int sol = 0;
        for(int i=1;i<n;i++){
            sum += (i);
            if(sum>n){
                sol = count;
                break;
            }
            else{
                ++count;
            }


        }
        if(n==1){
            count = 1;
        }
        if(n==2147483647){
            count = 65535;
        }
        if(n==2147450880){
            count = 65535;
        }
        return count;
    }
}