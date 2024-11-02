class Solution {
    public String mergeAlternately(String word1, String word2) {
        String sol = "";
        int count  = 0;
        int p = 0;
        int q = 0;
        for(int i=0;i<word1.length()+word2.length();i=i+0){
            if(count == 0){
                if(p<word1.length()){ 
                sol += word1.charAt(p++);
                ++i;
                }
                count = 1;
            }
            else{
                if(q<word2.length()){ 
                sol += word2.charAt(q++);
                ++i;
                }
                count = 0;
            }
        }
        return sol;
    }
}