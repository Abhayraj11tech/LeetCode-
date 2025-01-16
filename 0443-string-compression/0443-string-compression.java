class Solution {
    public int compress(char[] chars) {
        String sol = "";
        for(int i=0;i<chars.length;i++){
            Integer count = 1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                ++count;
                ++i;
            }
            sol += chars[i];
            if(count>1){
                sol += count.toString();
            }
        }
        for(int i=0;i<sol.length();i++){
            chars[i] = sol.charAt(i);
        }
        return sol.length();
    }
}
