class Solution {
    public boolean rotateString(String s, String goal) {
         boolean flag = false;
         StringBuilder str = new StringBuilder();
 
        str.append(s);
          
 
        for(int i=0;i<str.length();i++){
            char c = str.charAt(0);
            String string = str.toString();
            if(string.equals(goal)){
                flag = true;
                break;
            }
            else{
                for(int j=0;j<str.length();j++){
                        if(j==(str.length()-1)){
                            str.setCharAt(j,c);
                        }
                        else{
                             str.setCharAt(j,str.charAt(j+1));
                        }
                }
            }
     
        }
        return flag;
  
    

    }
}