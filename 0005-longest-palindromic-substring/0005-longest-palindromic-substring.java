class Solution {
    public String longestPalindrome(String str) {
        int n = str.length();
        String sol = "";

        for (int i = 0; i < n; i++) {
            String odd = expandAroundCenter(str, i, i);
            if (odd.length() > sol.length()) {
                sol = odd;
            }

            String even = expandAroundCenter(str, i, i + 1);
            if (even.length() > sol.length()) {
                sol = even;
            }
        }

        return sol;
    }

    private String expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}
