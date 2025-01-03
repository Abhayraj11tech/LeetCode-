class Solution {
    public int smallestNumber(int n) {
        while (true) {
            String s = Integer.toString(n, 2);
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if (str.charAt(0) == '1') {
                return n;
            } else {
                ++n;
            }
        }
    }
}
