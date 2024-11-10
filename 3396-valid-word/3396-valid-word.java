class Solution {
    public boolean isValid(String word) {
        String vow = "aeiouAEIOU";
        String con = "bcdfghjklmnpqrstvwxyz";
        String con2 = con.toUpperCase();
        int c = 0;
        int v = 0;
        if(word.length()<3){
            return false;
        }
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='0' && word.charAt(i)<='9'){
                continue;
            }
            else if(vow.contains(""+word.charAt(i))){
                ++v;
                continue;
            }
            else if(con.contains(""+word.charAt(i)) || con2.contains(""+word.charAt(i))){
                ++c;
                continue;
            }
            else{
                return false;

            }
        }
        if(v==0 || c==0){
            return false;
        }   
        return true;
    }
}