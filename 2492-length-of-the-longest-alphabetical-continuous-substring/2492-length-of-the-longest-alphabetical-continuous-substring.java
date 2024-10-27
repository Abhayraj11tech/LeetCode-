class Solution {
    public int longestContinuousSubstring(String s) {
        int val=1,max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                val++;
                max = Math.max(max,val);
            }
            else{
                val=1;
            }
        }
        return max;
    }
}