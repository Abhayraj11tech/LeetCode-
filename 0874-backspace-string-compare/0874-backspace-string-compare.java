class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String str) {
        StringBuilder sol = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sol.append(ch);
            } else if (sol.length() > 0) {
                sol.deleteCharAt(sol.length() - 1);
            }
        }
        return sol.toString();
    }
}
