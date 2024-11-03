class Solution {
    public String replaceDigits(String s) {
        String sol = "";
        for(int i=0;i<s.length();i=i+2){
            sol += s.charAt(i);
                if(i+1<s.length()){ 
                int val = (int)s.charAt(i) + Integer.parseInt(""+s.charAt(i+1));
                sol += (char)val;
                }
               
            
        }
        return sol;
    }
}