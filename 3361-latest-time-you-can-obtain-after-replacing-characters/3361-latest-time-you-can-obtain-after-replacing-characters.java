class Solution {
    public String findLatestTime(String time) {
        StringBuilder sol = new StringBuilder(time);

        if (sol.charAt(0) == '?') {
            if (sol.charAt(1) == '?' || sol.charAt(1) <'2') {
                sol.setCharAt(0, '1');
            } else {
                sol.setCharAt(0, '0');
            }
        }

        if (sol.charAt(1) == '?') {
            if (sol.charAt(0) == '1') {
                sol.setCharAt(1, '1');
            } else {
                sol.setCharAt(1, '9');
            }
        }

        if (sol.charAt(3) == '?') {
            sol.setCharAt(3, '5');
        }

        if (sol.charAt(4) == '?') {
            sol.setCharAt(4, '9');
        }

        return sol.toString();
    }
}
