class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int dt = x;
        int sum = 0;
        while(x!=0){
            int rem = x%10;
            sum += rem;
            x = x/10;
        }
        if(dt%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}