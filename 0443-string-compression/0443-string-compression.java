class Solution {
    public int compress(char[] chars) {
        int count = 0;
        int cmp = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                cmp++;
            } else {
                chars[count++] = chars[i - 1];
                if (cmp > 1) {
                    for (char c : Integer.toString(cmp).toCharArray()) {
                        chars[count++] = c;
                    }
                }
                cmp = 1;
            }
        }

        chars[count++] = chars[chars.length - 1];
        if (cmp > 1) {
            for (char c : Integer.toString(cmp).toCharArray()) {
                chars[count++] = c;
            }
        }

        return count;
    }
}
