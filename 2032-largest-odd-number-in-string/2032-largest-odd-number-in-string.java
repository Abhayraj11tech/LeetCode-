class Solution {
    public String largestOddNumber(String num) {
        String sol = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 != 0) {
                sol = num.substring(0, i + 1); 
            }
        }
        return sol;
    }
}
