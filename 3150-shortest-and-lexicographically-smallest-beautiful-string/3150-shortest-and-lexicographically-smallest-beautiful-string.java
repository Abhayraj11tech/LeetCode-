import java.util.ArrayList;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String sol = "";
        ArrayList<String> arr = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                str.append(s.charAt(j));
                arr.add(str.toString());
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            String current = arr.get(i);
            if (count(current) == k) {
                if (current.length() < min || (current.length() == min && current.compareTo(sol) < 0)) {
                    min = current.length();
                    sol = current;
                }
            }
        }

        return sol;
    }

    public int count(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ++val;
            }
        }
        return val;
    }
}
