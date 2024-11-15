class Solution {
    public int addDigits(int num) {
        int sol = 0;
        int sum = 0;
        int count =0;

        
        while(true){
            while(num!=0){
                int rem = num%10;
                sum += rem;
                num /=10;
            }
            int save_sum = sum;
            while(sum!=0){
                int tmp = sum%10;
                ++count;
                sum /=10;
            }
            if(count>1){
                count = 0;
                num = save_sum;
                save_sum = 0;
                sum = 0;
              

            }
            else{
                sol = save_sum;
                break;
            }
        }
        return sol ; 
    }
}