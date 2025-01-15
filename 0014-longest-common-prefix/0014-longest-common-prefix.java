class Solution {
    public String longestCommonPrefix(String[] str) {
        String chk = str[0];
        String res = "";
        int min = Integer.MAX_VALUE;
        if(str.length==1){
            return str[0];
        }
        for(int i=1;i<str.length;i++){
            int count = 0;
            String s = str[i];
            String sol = "";
            for(int j=0;j<s.length() && j<chk.length();j++){
                if(s.charAt(j)==chk.charAt(j)){
                    ++count;
                    sol += s.charAt(j);
                }
                else{
                    break;
                }
            }
            if(count<min){
                min = count;
                res = sol;
            }
        }
        return res;
    }
}