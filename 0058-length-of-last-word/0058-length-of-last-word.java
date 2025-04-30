class Solution {
    public int lengthOfLastWord(String s) {
        
        String input = "Geeks for Geeks";
 
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.reverse();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                ++count;
            }
            if(count!=0 && str.charAt(i)==' '){
                break;
            }
        }
        return count;
    }
}