class Solution {
    public int binaryGap(int n) {
        String s = Integer.toString(n,2);
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                int count = 1;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='0'){
                        ++count;
                    }
                    else{
                        max = Math.max(max,count);
                        break;
                    }
                }
            }
        }
        return max;
    }
}