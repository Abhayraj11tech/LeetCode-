class Solution {
    public int countAsterisks(String s) {
        int sol = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '|') {
                flag = !flag;
            } else if (ch == '*' && !flag) {
                sol++;
            }
        }

        return sol;
    }
}
