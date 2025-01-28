class Solution {
    public int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            for(int i=3;i<=n+1;i++){ 
            sum = n1 +n2;
            n1 = n2;
            n2 = sum;
            }
            return sum;
           

        }
    }
}