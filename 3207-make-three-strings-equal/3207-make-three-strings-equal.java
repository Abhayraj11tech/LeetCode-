class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int [] len = new int[3];
        len[0] = s1.length();
        len[1] = s2.length();
        len[2] = s3.length();
        int min = Math.min(len[0], Math.min(len[1], len[2]));
        int count = 0;
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                count++;
            }
            else {
                break;
            }
        }
        if (count == 0) {
            return -1;
        }
        int sol = 0;
        for (int val : len) {
            sol += val - count;
        }
        return sol;
    }
}
