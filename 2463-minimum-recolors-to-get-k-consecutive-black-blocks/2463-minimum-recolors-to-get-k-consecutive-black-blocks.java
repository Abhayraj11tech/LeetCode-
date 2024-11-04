class Solution {
    public int minimumRecolors(String blocks, int k) {
        int sol = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            int cng = 0;
            int count = 0;
            for(int j=i;j<blocks.length();j++){
                if(blocks.charAt(j)=='W'){
                    ++cng;
                }
                ++count;
                if(count==k){
                    sol = Math.min(sol,cng);
                    break;
                }
            }
        }
        return sol;
    }
}