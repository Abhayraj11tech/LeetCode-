import java.util.*;

class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            String s1 = words[i];
            boolean[] v = new boolean[26];

            for (int k = 0; k < s1.length(); k++) {
                v[s1.charAt(k) - 'a'] = true;
            }

            for (int j = i + 1; j < n; j++) {
                String s2 = words[j];
                boolean flag = false;

                for (int k = 0; k < s2.length(); k++) {
                    if (v[s2.charAt(k) - 'a']) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    max = Math.max(max, s1.length() * s2.length());
                }
            }
        }

        return max;
    }
}
