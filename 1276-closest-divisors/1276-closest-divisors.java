class Solution {
    public int[] closestDivisors(int num) {
        int[] sol = new int[2];
        int[] sol1 = findClosestDivisors(num + 1);
        int[] sol2 = findClosestDivisors(num + 2);
        
        if (Math.abs(sol1[0] - sol1[1]) < Math.abs(sol2[0] - sol2[1])) {
            return sol1;
        } else {
            return sol2;
        }
    }

    private int[] findClosestDivisors(int val) {
        for (int i = (int)Math.sqrt(val); i > 0; i--) {
            if (val % i == 0) {
                return new int[] {i, val / i};
            }
        }
        return new int[] {0, 0};
    }
}
