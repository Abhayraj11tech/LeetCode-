import java.util.*;

public class Solution {
    private static final String[] KEYPAD = {
        "",     "",     "abc",  "def", "ghi", 
        "jkl",  "mno",  "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> sol = new ArrayList<>();
        if (digits == null || digits.length() == 0) return sol;
        backtrack(sol, new StringBuilder(), digits, 0);
        return sol;
    }

    private void backtrack(List<String> sol, StringBuilder temp, String digits, int idx) {
        if (idx == digits.length()) {
            sol.add(temp.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            temp.append(c);
            backtrack(sol, temp, digits, idx + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
