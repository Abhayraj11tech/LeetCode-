class Solution {
    public String decodeAtIndex(String s, int k) {
        long val = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                val *= Character.getNumericValue(s.charAt(i));
            } else {
                val++;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                val /= Character.getNumericValue(c);
                k %= val;
            } else {
                if (k == val || k == 0) {
                    return String.valueOf(c);
                }
                val--;
            }
        }

        return "";
    }
}
