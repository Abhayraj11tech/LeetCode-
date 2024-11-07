class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String cmp1 = "abcdefghijklmnopqrstuvwxyz";
        String cmp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cmp3 = "1234567890";
        String cmp4 = "!@#$%^&*()-+";
        boolean chk1 = false, chk2 = false, chk3 = false, chk4 = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (i > 0 && password.charAt(i - 1) == password.charAt(i)) {
                return false;
            }
            if (cmp1.contains(Character.toString(password.charAt(i)))) {
                chk1 = true;
            } else if (cmp2.contains(Character.toString(password.charAt(i)))) {
                chk2 = true;
            } else if (cmp3.contains(Character.toString(password.charAt(i)))) {
                chk3 = true;
            } else if (cmp4.contains(Character.toString(password.charAt(i)))) {
                chk4 = true;
            }
        }

        if (!chk1 || !chk2 || !chk3 || !chk4) {
            return false;
        }
        return true;
    }
}
