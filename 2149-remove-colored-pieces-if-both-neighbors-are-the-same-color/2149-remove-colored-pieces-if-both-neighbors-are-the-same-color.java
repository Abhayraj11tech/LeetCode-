class Solution {
    public boolean winnerOfGame(String colors) {
        int val1 = 0;
        int val2 = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                val1++;
            }
            if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                val2++;
            }
        }

        return val1 > val2;
    }
}
