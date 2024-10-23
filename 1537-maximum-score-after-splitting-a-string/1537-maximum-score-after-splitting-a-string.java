class Solution {
    public int maxScore(String s) {
        String str1 = "";
        String str2 = "";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            str1 += s.charAt(i);
            int count1 = 0;
            int count2 = 0;
            for(int j=i+1;j<s.length();j++){
                str2 += s.charAt(j);
            }
            for(int a=0;a<str1.length();a++){
                if(str1.charAt(a)=='0'){
                    ++count1;
                }
            }
             for(int b=0;b<str2.length();b++){
                if(str2.charAt(b)=='1'){
                    ++count2;
                }
            }
            max = Math.max((count1+count2),max);
            str2 = "";
        }
        return max;
    }
}