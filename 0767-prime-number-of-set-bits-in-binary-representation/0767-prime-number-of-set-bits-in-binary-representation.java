class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i=left;i<=right;i++){
            String num = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)=='1'){
                    ++count;
                }
            }
            boolean flag = true;
            if(count==0 || count==1){
                continue;
            }
            else{
                for(int k=2;k<=count/2;k++){
                    if(count%k==0){
                        flag = false;
                        break;
                    }
                }}
                if(flag==true){
                    ++res;
                }
            }
    return res;
        }

}