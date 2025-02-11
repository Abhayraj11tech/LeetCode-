class Solution {
    public boolean isValid(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                str.append(s.charAt(i));
            } else {
                if (str.length() == 0 || 
                    (s.charAt(i) == ')' && str.charAt(str.length() - 1) != '(') || 
                    (s.charAt(i) == ']' && str.charAt(str.length() - 1) != '[') || 
                    (s.charAt(i) == '}' && str.charAt(str.length() - 1) != '{')) {
                    return false;
                }
                str.deleteCharAt(str.length() - 1);
            }
        }
        return str.length() == 0;
    }
}
