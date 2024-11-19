class Solution {
    public int countEven(int num) {
        int count = 0;
        int sum = 0;
        for(int i=1;i<=num;i++){
            int val = i;
            while(val!=0){
                int rem = val%10;
                sum += rem;
                val = val/10;
            }
            if(sum%2==0){
                ++count;
            }
            sum = 0;
        }
        return count;
    }
}