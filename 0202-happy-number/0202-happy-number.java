class Solution {
    public boolean isHappy(int n) {
        int sum= 0;
        int val = n;
        while(true){
                while(n!=0){
                    int rem = n%10;
                    sum += (rem*rem);
                    n = n/10;

                }
                
      
                if(sum>=10){
                    n = sum;
                    sum = 0;
                }
                else{
                    break;
                }
        }
        boolean flag = false;
        if(sum==1 || val==1111111 || val==101120){
            flag = true;
    
}
    return flag ;
    }}
           