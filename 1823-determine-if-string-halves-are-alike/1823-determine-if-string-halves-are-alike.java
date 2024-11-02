class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = "";
        String s2 = "";
        int count1 = 0;
        int count2 = 0;
        String cmp = "aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(cmp.contains(""+s.charAt(i))){
                ++count1;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(cmp.contains(""+s.charAt(i))){
                ++count2;
            }
        }
        return count1==count2 ? true : false;

        
    }
}