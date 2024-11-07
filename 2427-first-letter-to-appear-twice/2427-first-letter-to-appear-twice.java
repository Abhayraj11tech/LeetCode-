class Solution {
    public char repeatedCharacter(String s) {
        char res = ' ';
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int sol = Integer.MAX_VALUE;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)){
                    sol = j;
                    break;
                }
            }
            if(sol<min){
                res = s.charAt(i);
                min = sol;
            }
        }
        return res;
    }
}