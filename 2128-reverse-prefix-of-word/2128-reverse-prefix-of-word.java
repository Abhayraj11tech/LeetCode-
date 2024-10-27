class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;
        String sol = "";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=ch){
                sol += word.charAt(i);
            }
            else{
                sol += word.charAt(i);
                idx = i;
                break;
            }
        }
        if(idx!= -1){ 
        StringBuilder input1 = new StringBuilder();

        input1.append(sol);

        input1.reverse();
        String str = input1.toString();

        for(int i=idx+1;i<word.length();i++){
                str += word.charAt(i);
        }
        return str;
        }
        else{
            String str = sol;
        
        return str;
        }
    }
}