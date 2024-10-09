class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] sol = new int[word.length()];
        long num= 0;

        for (int i = 0; i < word.length(); i++) {
       
            num = (num* 10 + (word.charAt(i) - '0')) % m;

     
            if (num== 0) {
                sol[i] = 1;
            } else {
                sol[i] = 0;
            }
        }
        return sol;
    }
}