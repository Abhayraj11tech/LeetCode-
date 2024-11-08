import java.util.*;

class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> val = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                val.add(ch);
            }
        }

        Collections.sort(val);

        StringBuilder sol = new StringBuilder();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sol.append(val.get(p++));
            } else {
                sol.append(ch);
            }
        }

        return sol.toString();
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
