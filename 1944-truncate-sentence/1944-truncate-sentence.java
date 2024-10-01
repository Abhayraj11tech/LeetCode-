class Solution {
    public String truncateSentence(String s, int k) {
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                if(i==s.length()-1){
                    str += s.charAt(i);
                }
                arr.add(str);
                str = "";
            }
            else{
                str += s.charAt(i);
            }

    }
        String sol = "";
        for(int i=0;i<k;i++){
            sol += arr.get(i);
            if(i!=k-1){
            sol += " ";
            }
        }
        return sol;
    }
}