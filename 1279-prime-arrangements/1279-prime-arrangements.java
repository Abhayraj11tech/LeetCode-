class Solution {

    static boolean prime(int n){

        if(n==1){
            return false;
        }

        for(int i=2;i*i<=(n);i++){
            if(n%i==0){
                return false;
        }
        }
        return true;
    }
    
    public int numPrimeArrangements(int n) {
        
        long sol=1;
        int mod=1000000007;
        int count=0;

        for(int i=1;i<=n;i++){
            if(prime(i)){
                count++;
            }
        }


        for(int i=1;i<=count;i++){
            sol=(sol*i)%mod;
        }

        for(int i=1;i<=n-count;i++){
            sol=(sol*i)%mod;
        }

        return (int)sol;
       
    }
}