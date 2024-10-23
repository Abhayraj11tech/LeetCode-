class Solution {
    public String reformat(String s) {
        ArrayList<Character> num = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num.add(s.charAt(i));
            } else {
                ch.add(s.charAt(i));
            }
        }

        if (Math.abs(num.size() - ch.size()) > 1) {
            return "";
        }

        StringBuilder sol = new StringBuilder();
        int p = 0, q = 0;
        boolean isNum = num.size() >= ch.size();

        while (p < num.size() || q < ch.size()) {
            if (isNum) {
                if (p < num.size()) {
                    sol.append(num.get(p++));
                }
                if (q < ch.size()) {
                    sol.append(ch.get(q++));
                }
            } else {
                if (q < ch.size()) {
                    sol.append(ch.get(q++));
                }
                if (p < num.size()) {
                    sol.append(num.get(p++));
                }
            }
        }

        return sol.toString();
    }
}
