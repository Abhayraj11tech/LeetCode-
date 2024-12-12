class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toString(n,2);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ++count;
            }
        }
        return count;
    }
}