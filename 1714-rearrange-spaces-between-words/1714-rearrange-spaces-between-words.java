class Solution {
    public String reorderSpaces(String text) {
        int count = 0;
        String str = text;
        String[] words = str.split(" ");
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                ++count;
            }
        }
        
        words = java.util.Arrays.stream(words).filter(word -> !word.isEmpty()).toArray(String[]::new);

        int div = (words.length > 1) ? count / (words.length - 1) : 0;
        int remainder = (words.length > 1) ? count % (words.length - 1) : count;
        
        String sol = "";
        for (int i = 0; i < words.length; i++) {
            sol += words[i];
            if (i < words.length - 1) {
                for (int j = 0; j < div; j++) {
                    sol += " ";
                }
            }
        }
        
        for (int k = 0; k < remainder; k++) {
            sol += " ";
        }
        
        return sol;
    }
}
