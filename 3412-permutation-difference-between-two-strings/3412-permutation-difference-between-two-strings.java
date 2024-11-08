class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = t.indexOf(s.charAt(i));  
            sum += Math.abs(i - val);
        }
        return sum;
    }
}
