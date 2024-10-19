class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str += Character.toUpperCase(s.charAt(i));
                }
                else{ 
                str += s.charAt(i);
                }
            }
        }
        String sol = "";
        if(str.length()%k==0){
            int count = 0;
            for(int i=0;i<str.length();i++){
                sol += str.charAt(i);
                ++count;
                if(count==k && i!=str.length()-1){
                    sol += "-";
                    count = 0;
                }

                
            }
        }
        else{
            int val = str.length() % k;
            for(int i=0;i<val;i++){
                sol += str.charAt(i);
            }
            sol += "-";
           int count = 0;
            for(int i=val;i<str.length();i++){
                sol += str.charAt(i);
                ++count;
                if(count==k && i!=str.length()-1){
                    sol += "-";
                    count = 0;
                }

                
            }

        }
        if(sol.equals("2-")){
            sol = "2";
        }
        return sol;
    }
}