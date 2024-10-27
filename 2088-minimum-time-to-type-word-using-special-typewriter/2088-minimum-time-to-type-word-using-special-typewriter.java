class Solution {
    public int minTimeToType(String word) {
        int count = 0;
        char c = 'a';

        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            int num = Math.abs(val - c);
            int dis = 26 - num;
            count += Math.min(num, dis) + 1;
            c = word.charAt(i);
        }

        return count;
    }
}
