class Solution {
    public boolean checkString(String s) {
        int idx = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                idx = i;
            }
            else{
                if(i>idx){
                    return false;
                }
            }
        }
        return true;
    }
}