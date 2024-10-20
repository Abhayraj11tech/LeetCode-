class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sol = new StringBuilder(s);
        int count = 0;
        int n = shifts.length;
        for (int i = n - 1; i >= 0; i--) {
            count = (count + shifts[i]) % 26; 

            char c = sol.charAt(i);
            char ch = (char) ((c - 'a' + count) % 26 + 'a');
            sol.setCharAt(i, ch);
        }

        return sol.toString();
    }
}
