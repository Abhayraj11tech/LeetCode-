class Solution {
    public int maxVowels(String s, int k) {
        int max = 0, count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        max = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}