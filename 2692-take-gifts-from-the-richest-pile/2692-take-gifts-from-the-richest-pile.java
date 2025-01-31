class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        long sol = 0L;
        while (k-- > 0) {
            int val = gifts[gifts.length - 1];
            gifts[gifts.length - 1] = (int) Math.sqrt(val);
            Arrays.sort(gifts);
        }
        for (int gift : gifts) {
            sol += gift;
        }
        return sol;
    }
}
