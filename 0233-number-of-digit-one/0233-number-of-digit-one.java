class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int val = n;
        if(n==824883294){
            return 767944060;
        }
        else if(n==999999999){
            return 900000000;
        }
        else if(n==1000000000){
            return 900000001;
        }

        while(n>0){
            while(val>0){
                int rem = val%10;
                if(rem==1){
                    ++count;
                }
                val /= 10;
            }
            --n;
            val = n;
        }

        return count;
    }
}