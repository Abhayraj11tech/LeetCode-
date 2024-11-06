class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j - i == 2) {
                    if (chars1[i] != chars2[i] && chars1[j] != chars2[j]) {
                        char temp = chars1[i];
                        chars1[i] = chars1[j];
                        chars1[j] = temp;
                    }
                }
            }
        }

        return new String(chars1).equals(s2);
    }
}
