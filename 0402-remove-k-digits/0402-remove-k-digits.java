class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for (char c : num.toCharArray()) {
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }

        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }

        StringBuilder sol = new StringBuilder();
        for (char c : s) {
            sol.append(c);
        }

        while (sol.length() > 0 && sol.charAt(0) == '0') {
            sol.deleteCharAt(0);
        }

        return sol.length() == 0 ? "0" : sol.toString();
    }
}
