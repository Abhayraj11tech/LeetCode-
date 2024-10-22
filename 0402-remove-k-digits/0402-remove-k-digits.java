class Solution {
    public String removeKdigits(String s, int k) {
        StringBuilder sb = new StringBuilder();    
        for(int i = 0; i < s.length(); i++){
            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > s.charAt(i)){
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(s.charAt(i));
        }
        while(k > 0 && sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}