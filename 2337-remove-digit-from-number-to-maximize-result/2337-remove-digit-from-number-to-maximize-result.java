class Solution {
    public String removeDigit(String num, char digit) {
        String res = "";

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == digit) {
                if (i < num.length() - 1 && num.charAt(i + 1) > digit) {
                    return num.substring(0, i) + num.substring(i + 1);
                }
                if (i < num.length() - 1) {
                    String temp = num.substring(0, i) + num.substring(i + 1);
                    if (temp.compareTo(res) > 0) {
                        res = temp;
                    }
                } else {
                    String temp = num.substring(0, i);
                    if (temp.compareTo(res) > 0) {
                        res = temp;
                    }
                }
            }
        }

        return res;
    }
}
