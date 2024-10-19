class Solution {
    public String reverseWords(String s) {
         ArrayList<String> str = new ArrayList<String>();
        String elm = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                elm += s.charAt(i);
            }
            if(s.charAt(i)==' ' || i==(s.length()-1) ) {
                str.add(elm);
                elm = "";
            }
        
    
}
    String tmp = "";
        ArrayList<String> sol = new ArrayList<String>();
        for(int j=0;j<str.size();j++){
            String check = str.get(j);
            for(int k=check.length()-1;k>=0;k--){
                tmp += check.charAt(k);
                
            }
            sol.add(tmp);
            tmp = "";
            
        }
          String[] ans = new String[sol.size()];
 
        for (int i = 0; i < sol.size(); i++) {
            ans[i] = sol.get(i);
        }
      StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < ans.length; i++) {
    stringBuilder.append(ans[i]);
    if(i!=ans.length-1){ 
       stringBuilder.append(" ");
    }

}
String res = stringBuilder.toString();
    return res;
     
    }
}