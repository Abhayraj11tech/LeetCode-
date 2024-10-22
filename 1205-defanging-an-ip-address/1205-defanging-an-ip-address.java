class Solution {
    public String defangIPaddr(String address) {
        String sol = "";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sol += "[.]";
            }
            else{
                sol += address.charAt(i);
            }
        }
        return sol;
    }
}