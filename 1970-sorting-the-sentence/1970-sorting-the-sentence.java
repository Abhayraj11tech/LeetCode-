class Solution {
    public String sortSentence(String s) {
        ArrayList<String> val = new ArrayList<>();
        String add = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                val.add(add);
                add = "";
            } else {
                add += s.charAt(i);
            }
        }
        val.add(add);

        int max = 0;
        for (String word : val) {
            int idx = word.charAt(word.length() - 1) - '0';
            if (idx > max) {
                max= idx;
            }
        }

        String[] str = new String[max];

        for (String cmp : val) {
            int idx = cmp.charAt(cmp.length() - 1) - '0';
            String sol = cmp.substring(0, cmp.length() - 1);
            str[idx - 1] = sol;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            res.append(str[i]);
            if (i < str.length - 1) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}
