class Solution {
    public int divide(int dividend, int divisor) {
        int sol = 0;
        if(dividend !=0  && divisor!=0){
        
        sol = dividend/divisor;
        }

        if(sol>(Math.pow(2,31) - 1)){
            sol = (int) Math.pow(2,31) - 1;
        }
        else if(sol<(-(Math.pow(2,31)))) {
                sol = (int)(-(Math.pow(2,31)));
        }
        if(dividend==-2147483648 && divisor==-1){
            sol = 2147483647;

        }
        else if(dividend==-2147483648 && divisor==1){
            sol = -2147483648 ;
        }

        return sol;


    }
}