class Solution {
    public int longestBeautifulSubstring(String word) {
        int count = 1, length = 1, max = 0;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                length++;
            } else if (isNextVowelInOrder(word.charAt(i - 1), word.charAt(i))) {
                length++;
                count++;
            } else {
                length = 1;
                count = 1;
            }

            if (count == 5) {
                max = Math.max(max, length);
            }
        }

        return max;
    }

    private boolean isNextVowelInOrder(char first, char sec) {
        return (first == 'a' && sec == 'e') || 
               (first == 'e' && sec == 'i') || 
               (first == 'i' && sec == 'o') || 
               (first == 'o' && sec == 'u');
    }
}
