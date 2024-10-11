class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> sol = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String str = words.get(i);
            String elm = "";
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==separator){
                    if(!elm.equals("")){ 
                    sol.add(elm);
                    }
                    elm = "";
                }
                else{
                    elm += str.charAt(j);
                }
            }
             if(!elm.equals("")){ 
                    sol.add(elm);
                    }
        }
        return sol;
    }
}