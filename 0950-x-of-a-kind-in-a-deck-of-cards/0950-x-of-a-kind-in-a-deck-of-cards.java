class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int count = 1;
        int gcd = -1;

        for (int i = 1; i <= deck.length; i++) {
            if (i < deck.length && deck[i] == deck[i - 1]) {
                ++count;
            } else {
                if (gcd == -1) {
                    gcd = count;
                } else {
                    gcd = gcd(gcd, count);
                }
                if (gcd == 1) {
                    return false;
                }
                count = 1;
            }
        }
        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
