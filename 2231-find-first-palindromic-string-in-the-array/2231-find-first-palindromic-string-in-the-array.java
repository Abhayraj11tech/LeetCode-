class Solution {
    public String firstPalindrome(String[] words) {
        String sol = "";
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String val = "";
            for(int j=str.length()-1;j>=0;j--){
                val += str.charAt(j);
            }
            if(str.equals(val)){
                sol = str;
                break;
            }
        }
        return sol;
    }
}