class Solution {
    public boolean sumOfNumberAndReverse(int num) {
         boolean flag = false;

        for(int i=1;i<=num;i++){
            int val = i;
            int sum = 0;
            int rev = 0;
            while(val!=0){
                int rem = val%10;
                rev = rev*10+rem;
                val  = val/10;
            }
         
            sum = i+rev;
     
            if(sum == num){

                flag = true;
                break;
            }


            

        }
        if(num==0){
            return true;
        }
        else{ 
        return flag;
        }

    }
}