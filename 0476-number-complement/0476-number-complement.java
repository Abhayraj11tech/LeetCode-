class Solution {
    public int findComplement(int num) {
        String s = Integer.toString(num,2);
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                str += "1";
            }
            else{
                str += "0";
            }
        }
        return Integer.parseInt(str,2);
    }
}