class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=Character.toLowerCase(s.charAt(i-1)) && s.charAt(i)!=Character.toUpperCase(s.charAt(i-1))  ){
                ++count;
            }
        }
        return count;
    }
}