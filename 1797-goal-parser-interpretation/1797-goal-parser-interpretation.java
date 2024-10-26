class Solution {
    public String interpret(String command) {
        String sol = "";
        for(int i=0;i<command.length();i++){
if(command.charAt(i)=='(' && i+1<command.length() && command.charAt(i+1)==')'){
        sol += "o";
    }
    else if(command.charAt(i)>='a' && command.charAt(i)<='z'){
        sol += command.charAt(i);
    }
     else if(command.charAt(i)>='A' && command.charAt(i)<='Z'){
        sol += command.charAt(i);
    }
    
        }
        return sol;
    }
}