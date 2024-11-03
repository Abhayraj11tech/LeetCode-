class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int sol = 0;
        for (int i = 0; i <= s.length() - k; i++) { 
            int count = 0;
            int j = i;
            String str = "";
            while (count != k && j < s.length()) {
                str += s.charAt(j);
                ++j;
                ++count;
            }
            int val = Integer.parseInt(str);
            if (val != 0 && num % val == 0) {
                ++sol;
            }
        }
        return sol;
    }
}
