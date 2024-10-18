class Solution {
    public int firstUniqChar(String s) {
        int sol = -1;
        boolean flag  = true;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i) && i!=j){
                    flag = false;
                    break;
                }
                
            }
            if(flag == true ||i==s.length()-1){
                if(i==s.length()-1 && flag!=true){
                    sol = -1;
                }
                else if(i==s.length()-1 && flag==true){
                    sol = i;
                }
                else{ 
                sol = i;
                }
                break;
            }
            else{
                flag = true;

            }
           
        }
        if(s.length()==1){
            sol = 0;
        }
        return sol;
    }}