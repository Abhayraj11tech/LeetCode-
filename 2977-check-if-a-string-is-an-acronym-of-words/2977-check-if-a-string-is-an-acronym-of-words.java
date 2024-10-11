class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str = "";
        for(int i=0;i<words.size();i++){
            String val = words.get(i);
            str += val.charAt(0);
        }
        if(str.equals(s)){
            return true;
        }
        else {
            return false;
        }
    }
}