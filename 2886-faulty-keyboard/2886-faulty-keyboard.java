class Solution {
    public String finalString(String s) {
        StringBuilder sol = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sol.reverse();
            }
            else{
                sol.append(s.charAt(i));
            }
        }
        return sol.toString();
    }
}