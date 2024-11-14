class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i<=(int)(Math.sqrt(c)); i++) {
            int val = c - (i * i);
            double sq = Math.sqrt(val);
            if(sq == (int)sq && (int)sq*(int)sq==val){
                return true;
            }
        }
        return false;
    }
}