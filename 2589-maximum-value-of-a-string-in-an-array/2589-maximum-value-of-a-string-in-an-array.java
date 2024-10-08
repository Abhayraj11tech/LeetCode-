class Solution {
    public int maximumValue(String[] strs) {
        String chk = "1234567890";
        int sol = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < strs.length; i++) {
            String val = strs[i];
       

            int len;
            try {
                len = Integer.parseInt(val);
            } catch (NumberFormatException e) {
                len = val.length();
            }
          

            if (len > max) {
                sol = len;
                max = len;
            }
        }
        return sol;
    }
}
