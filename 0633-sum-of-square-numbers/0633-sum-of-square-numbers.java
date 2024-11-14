class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i<=(int)(Math.sqrt(c)); i++) {
            int val = c - (i * i);
            int sq = (int)Math.sqrt(val);
            if(sq*sq==val){
                return true;
            }
        }
        return false;
    }
}