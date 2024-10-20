class Solution {
    public String toGoatLatin(String sentence) {
        List<String> arr = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        String sol = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                sol += sentence.charAt(i);
            } else {
                arr.add(sol);
                sol = "";
            }
            if (i == sentence.length() - 1) {
                arr.add(sol);
            }
        }

        String res = "";
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            if (s.charAt(0) != 'a' && s.charAt(0) != 'e' && s.charAt(0) != 'i' && s.charAt(0) != 'o' && s.charAt(0) != 'u'
                    && s.charAt(0) != 'A' && s.charAt(0) != 'E' && s.charAt(0) != 'I' && s.charAt(0) != 'O'
                    && s.charAt(0) != 'U') {
                for (int a = 1; a < s.length(); a++) {
                    res += s.charAt(a);
                }
                res += s.charAt(0);
            } else {
                res += s;
            }
            res += "ma";
            for (int j = 0; j <= i; j++) {
                res += "a";
            }
            ans.add(res);
            res = "";
        }

         String arraylist = String.join(" ", ans);
         return arraylist;
    }
}