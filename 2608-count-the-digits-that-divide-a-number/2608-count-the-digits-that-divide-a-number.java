class Solution {
    public int countDigits(int num) {
        int val = num;
        int count = 0;
        while(num!=0){
            int rem = num%10;
            if(val%rem == 0){
                ++count;
            }
            num = num/10;
        }
            return count;
        
    }
}