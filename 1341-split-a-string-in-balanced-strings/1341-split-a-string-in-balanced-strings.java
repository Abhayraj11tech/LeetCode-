class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else if (s.charAt(i) == 'R') {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    int countL(String str) {
        int val = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                ++val;
            }
        }
        return val;
    }

    int countR(String str) {
        int val = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                ++val;
            }
        }
        return val;
    }
}
