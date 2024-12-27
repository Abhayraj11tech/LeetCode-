class Solution {
    public int[] evenOddBit(int n) {
        int sol[] = new int[2];
        StringBuilder s = new StringBuilder(Integer.toBinaryString(n));
        while (s.length() % 2 != 0) {
            s.insert(0, "0"); 
        }

        int even = 0;
        int odd = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                if ( i % 2 == 0) {
                    ++odd;
                } else {
                    ++even; 
                }
            }
        }

        sol[0] = even;
        sol[1] = odd;
        return sol;
    }
}
