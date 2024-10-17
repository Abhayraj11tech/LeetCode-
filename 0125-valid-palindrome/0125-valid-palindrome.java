class Solution {
    public boolean isPalindrome(String s) {
       boolean flag = true;
        String res ="";
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                res += s.charAt(i);
            }
            else if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                res += ((char)(s.charAt(i)+32));
            }
            else if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57){
                 res += s.charAt(i);
            }
            else{
                continue;
            }
        }
        
        for(int i=0;i<res.length()/2;i++){
            if(res.charAt(i)!=res.charAt(res.length()-1-i)){
                flag = false;
                break;
            }
        }

        // System.out.print(flag);
        return flag;
        
    

    }
}