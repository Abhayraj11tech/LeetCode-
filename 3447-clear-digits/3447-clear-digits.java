class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    if (i > 0 && !Character.isDigit(str.charAt(i - 1))) {
                        str.delete(i - 1, i + 1);
                        flag = false;
                        break;
                    }
                }
            }
        }

        return str.toString();
    }
}
