class Solution {
    public String longestNiceSubstring(String s) {
        String sol = "";
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int p = i + 1; p <= s.length(); p++) {
                String str = s.substring(i, p);
                boolean up = false;
                boolean down = false;
                int flag = 1;
                
                for (char c : str.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        up = true;
                    } else if (Character.isLowerCase(c)) {
                        down = true;
                    }
                }

                for (char c : str.toCharArray()) {
                    if (!str.contains(Character.toString(Character.toUpperCase(c))) || 
                        !str.contains(Character.toString(Character.toLowerCase(c)))) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1 && up && down && str.length() > max) {
                    max = str.length();
                    sol = str;
                }
            }
        }
        return sol;
    }
}
