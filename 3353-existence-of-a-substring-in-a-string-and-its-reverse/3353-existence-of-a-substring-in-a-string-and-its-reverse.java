import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isSubstringPresent(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }

        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String cmp = str.toString();

        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < cmp.length() - 1; i++) {
            substrings.add(cmp.substring(i, i + 2));
        }

        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (substrings.contains(sub)) {
                return true;
            }
        }

        return false;
    }
}
