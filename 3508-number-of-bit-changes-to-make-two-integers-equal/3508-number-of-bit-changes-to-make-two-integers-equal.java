class Solution {
    public int minChanges(int n, int k) {
        int count = 0;
        StringBuilder s1 = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder s2 = new StringBuilder(Integer.toBinaryString(k));

        while (s1.length() < s2.length()) {
            s1.insert(0, "0");
        }
        while (s2.length() < s1.length()) {
            s2.insert(0, "0");
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i) && s1.charAt(i) == '1') {
                s1.setCharAt(i, '0');
                ++count;
            }
        }

        if (s1.toString().equals(s2.toString())) {
            return count;
        } else {
            return -1;
        }
    }
}
