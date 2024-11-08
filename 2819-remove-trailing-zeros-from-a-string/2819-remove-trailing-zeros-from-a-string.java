class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sol = new StringBuilder();
        boolean flag = false;

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0' && !flag) {
                continue;
            } else {
                flag = true;
                sol.append(num.charAt(i));
            }
        }

        return sol.reverse().toString();
    }
}
