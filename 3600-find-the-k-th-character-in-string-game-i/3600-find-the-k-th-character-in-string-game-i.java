class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while (str.length() < k) {
            StringBuilder s = new StringBuilder(str);
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i) == 'z' ? 'a' : (char)(str.charAt(i) + 1);
                s.append(c);
            }
            str = s;
        }
        return str.charAt(k - 1);
    }
}
