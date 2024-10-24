class Solution {
    public int minSwaps(String s) {
        int count0 = 0;
        int count1 = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                count0++;
            } else {
                count1++;
            }
        }

        if (Math.abs(count0 - count1) > 1) {
            return -1;
        }

        int val1 = 0;
        int val2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '0') {
                    val1++;
                }
                if (s.charAt(i) != '1') {
                    val2++;
                }
            } else {
                if (s.charAt(i) != '1') {
                    val1++;
                }
                if (s.charAt(i) != '0') {
                    val2++;
                }
            }
        }

        if (count0 > count1) {
            return val1 / 2;
        } else if (count1 > count0) {
            return val2 / 2;
        } else {
            return Math.min(val1, val2) / 2;
        }
    }
}
