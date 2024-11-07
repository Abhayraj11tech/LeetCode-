class Solution {
    public String greatestLetter(String s) {
        String sol = "";
       for(char c='z';c>='a';c--){
        String res = "" + c;
            if(s.contains(res)){
                
                if(s.contains(res.toUpperCase() )){
                    sol = res.toUpperCase();
                    break;
                }
            }
       }
       return sol;
    }
}