class Solution {
    public int partitionString(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) { 
            String str = ""; 
            for (int j = i; j < s.length(); j++) {
                if (str.indexOf(s.charAt(j)) == -1) {
                    str += s.charAt(j);
                } else {
                    count++;
                    i = j;
                    break;
                }
                if (j == s.length() - 1) {
                    count++;
                    i = s.length();
                }
            }
            if (str.isEmpty() && i < s.length()) {
                count++;
                i++;
            }
        }
        return count;
    }
}
