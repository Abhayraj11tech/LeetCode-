class Solution {
    public boolean checkRecord(String s) {
        int abs = 0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                ++abs;
            }
        }

 for(int j=0;j<s.length();j++){
    if(s.charAt(j)=='L'){
        if((j+2)<s.length()){
    if(s.charAt(j+1)==s.charAt(j) && s.charAt(j+2)==s.charAt(j)){
        flag = false;
        break;
    }
                }            }
        }
        if(flag==true && abs<2){
            return true;
        }
        else{
            return false;
        }

    }
}