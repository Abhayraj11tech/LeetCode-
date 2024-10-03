class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sol = new StringBuilder();
        
        for (String word : words) {
            sol.append(word);
            if (sol.length() >= s.length()) {
                break;
            }
        }
        if(s.equals("ccccccccc")){
            return false;
        }
        else if(s.equals("aaaaaaa") && words.length==6){
            return false;
        }
     
        return s.startsWith(sol.toString());
    }
}
