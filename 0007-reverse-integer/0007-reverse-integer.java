class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
        }

        String str = "";
        int val = Math.abs(x); 
        while (val != 0) {
            str += Integer.toString(val % 10);
            val = val / 10;
        }

        String sol = "";
        if (flag) {
            sol += "-";
        }

        sol += str;
        try {
            return Integer.parseInt(sol);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
