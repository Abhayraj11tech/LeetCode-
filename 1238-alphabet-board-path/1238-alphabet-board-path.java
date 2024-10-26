class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sol = new StringBuilder();
        int val1 = 0, val2 = 0;

        for (char ch : target.toCharArray()) {
            int num1 = (ch - 'a') / 5;
            int num2 = (ch - 'a') % 5;

  
            if (ch == 'z') {
                while (val2 > num2) {
                    sol.append('L');
                    val2--;
                }
                while (val1 < num1) {
                    sol.append('D');
                    val1++;
                }
            } else {
                while (val1 < num1) {
                    sol.append('D');
                    val1++;
                }
                while (val1 > num1) {
                    sol.append('U');
                    val1--;
                }
                while (val2 < num2) {
                    sol.append('R');
                    val2++;
                }
                while (val2 > num2) {
                    sol.append('L');
                    val2--;
                }
            }

            sol.append('!');
        }

        return sol.toString();
    }
}
