class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i=2;i<=n-2;i++){
            String str = Integer.toString(n,i);
            boolean flag = true;
           for(int j=0;j<str.length()/2;j++){
                if(str.charAt(j)!=str.charAt(str.length()-1-j)){
                    return false;
                }
           }
           
        }
        return true;
    }
}