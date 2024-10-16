class Solution {
    public int strStr(String haystack, String needle) {
        int p = 0;
        int count = 0;
        int sol = -1;
        boolean flag = false;
        
        if (needle.isEmpty()) {
            sol = 0;
        } else if (haystack.equals(needle)) {
            sol = 0;
        } else if (needle.length() > haystack.length()) {
            sol = -1;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    p = 0;
                    count = 0;
                    for (int j = i; j < haystack.length() && p < needle.length(); j++) {
                        if (haystack.charAt(j) == needle.charAt(p)) {
                            count++;
                            p++;
                        } else {
                            break;
                        }
                    }
                    if (count == needle.length()) {
                        flag = true;
                        sol = i;
                        break;
                    }
                }
            }
        }
        
        return sol;
    }
}
