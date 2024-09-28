class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder val = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (val.length() > 0) {
                    words.add(val.toString());
                    val.setLength(0);
                }
            } else {
                val.append(s.charAt(i));
            }
        }
        if (val.length() > 0) {
            words.add(val.toString());
        }

        int max = 0;
        for (String word : words) {
            max = Math.max(max, word.length());
        }

        for (int i = 0; i < max; i++) {
            StringBuilder sol = new StringBuilder();
            for (String word : words) {
                if (i < word.length()) {
                    sol.append(word.charAt(i));
                } else {
                    sol.append(' ');
                }
            }
            res.add(sol.toString().stripTrailing());
        }

        return res;
    }
}
