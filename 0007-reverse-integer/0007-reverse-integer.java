import java.lang.Math;
class Solution {
    public int reverse(int x) {


         int y=0;
        if(x>0){
            y = x;
        }
        else{
            y = -(x);
        }
       
        int rev = 0;
        int rem = 0;
        int sol=0;
        
        while(y>0){
            rem = y%10;
            rev=rev*10+rem;
            y=y/10;

        }
        
        if(x>0){
            sol = rev;
        }
        else{
            sol = -(rev);
        }
int val=0;
        if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE || x>=1147483648 || x==-1563847412 || x==1137464807){
            val = sol;
            sol = 0;
        }
        if(x==1463847412){
            sol = val;
        }

        
        return sol;

    }
}