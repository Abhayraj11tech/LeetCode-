class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = false;
        int count = 0;
        int check = 0;
 if( ((int)word.charAt(0))>=65 && ((int)word.charAt(0))<=90     ){
                for(int j=0 ;j<word.length();j++){
 if( ((int)word.charAt(j))>=65 && ((int)word.charAt(j))<=90     ){
                        ++count;
                    }
 } 
            }
            


 else if( ((int)word.charAt(0))>=97 && ((int)word.charAt(0))<=122     ){
                for(int j=0 ;j<word.length();j++){
 if( ((int)word.charAt(j))>=97 && ((int)word.charAt(j))<=122    ){
                        ++check;
                    }
 } 
            }
           
            
            
    if( (count==word.length())){
        flag = true;
    }
    else if(count==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')) {
        flag = true;
    }
    
    else if(check==word.length()){
        flag =  true;
    }
    
    return flag;
    // System.out.println(flag);
    
    
    
    
            
            
        
    }}