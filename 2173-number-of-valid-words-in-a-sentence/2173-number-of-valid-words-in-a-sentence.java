import java.util.ArrayList;

class Solution {
    public int countValidWords(String sentence) {
        String[] arr = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : arr) {
            if (isValid(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValid(String word) {
        int hyphenCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isDigit(ch)) {
                return false;
            }

            if (ch == '-') {
                hyphenCount++;
                if (hyphenCount > 1) {
                    return false;
                }
                if (i == 0 || i == word.length() - 1 || !Character.isLetter(word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) {
                    return false;
                }
            }

            if (ch == '.' || ch == ',' || ch == '!') {
                if (i != word.length() - 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
