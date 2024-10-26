class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 1; i < str.length(); i++) {
                if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(i - 1)) && 
                    str.charAt(i) != str.charAt(i - 1)) {
                    str.delete(i - 1, i + 1);
                    flag = false;
                    break;
                }
            }
        }

        return str.toString();
    }
}
