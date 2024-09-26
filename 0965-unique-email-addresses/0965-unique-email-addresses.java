class Solution {
    public int numUniqueEmails(String[] emails) {
      String[] str=new String[emails.length];
 
        for(int i=0;i<emails.length;i++){
            String s = emails[i];
            String res = "";
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='.'){
                    continue;
                }
                else if(s.charAt(j)=='+' || s.charAt(j)=='@'){
                    break;
                }
                
                else{
                    res += s.charAt(j);
                }
            }
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)=='@'){
                    for(int p=k;p<s.length();p++){
                        res += s.charAt(p);
                    }
                }
            }
            str[i] = res;

    }
    Arrays.sort(str);
    int count = 1;
    for(int i=0;i<str.length;i++){
        if((i+1)<str.length && !(str[i+1].equals(str[i]))){
            ++count;
        }
      
    }
  
    return count;
    

    }
}