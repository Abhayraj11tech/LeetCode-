class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }


        int count = 0;
        StringBuilder cmp1 = new StringBuilder(s1);
        StringBuilder cmp2 = new StringBuilder(s2);

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        if (count != 2) {
            return false;
        }

        int val1 = -1, val2 = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (val1 == -1) {
                    val1 = i;
                } else {
                    val2 = i;
                }
            }
        }

        return s1.charAt(val1) == s2.charAt(val2) &&
               s1.charAt(val2) == s2.charAt(val1);
    }
}
