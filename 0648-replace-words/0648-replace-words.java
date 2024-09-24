import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        int p = 0;
        String sol = "";
        ArrayList<String> data = new ArrayList<>();

        String s1 = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                data.add(s1);
                s1 = "";
            } else {
                s1 += sentence.charAt(i);
            }
        }
        data.add(s1);

        String res = "";
        for (int j = 0; j < data.size(); j++) {
            String cmp = data.get(j);
            String replacement = cmp;
            
            for (int i = 0; i < dictionary.size(); i++) {
                String dictWord = dictionary.get(i);
                if (cmp.startsWith(dictWord)) {
                    if (dictWord.length() < replacement.length()) {
                        replacement = dictWord;
                    }
                }
            }
            
            res += replacement;
            if (j < data.size() - 1) {
                res += ' ';
            }
        }

        return res;
    }
}
