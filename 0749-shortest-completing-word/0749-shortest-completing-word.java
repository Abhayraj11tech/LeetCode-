public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        String normalizedLicensePlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String shortestWord = "";
        int minLength = Integer.MAX_VALUE;

        for (String word : words) {
        
            String normalizedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            boolean containsAllLetters = true;
            for (char c : normalizedLicensePlate.toCharArray()) {
                if (normalizedWord.indexOf(c) == -1) {
                    containsAllLetters = false;
                    break;
                }
                else{
                    
        StringBuilder string = new StringBuilder(normalizedWord);
        string.setCharAt(normalizedWord.indexOf(c), '*');
        normalizedWord = new String(string);
                }
            }

            if (containsAllLetters && word.length() < minLength) {
                shortestWord = word;
                minLength = word.length();
            }
        }

        return shortestWord;
    }
}
