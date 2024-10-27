class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         String[] words = text.split(" ");
        boolean[] broken = new boolean[26];
        
        for (char ch : brokenLetters.toCharArray()) {
            broken[ch - 'a'] = true;
        }
        
        int sol = 0;
        for (String word : words) {
            boolean flag = true;
            for (char ch : word.toCharArray()) {
                if (broken[ch - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sol++;
            }
        }
        
        return sol;
    }
}
