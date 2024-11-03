class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0;
        int count1 = 0;
 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ++count1;
            }
            else{
                one = Math.max(one,count1);
                count1 = 0;
            }
        }
        one = Math.max(one,count1);
        int count2 = 0;
        int zero = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ++count2;
            }
            else{
                zero = Math.max(zero,count2);
                count2 = 0;
            }
        }
        zero = Math.max(zero,count2);
        return one > zero ? true : false;
    }
}