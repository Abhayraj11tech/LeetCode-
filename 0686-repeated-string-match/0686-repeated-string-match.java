class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        StringBuilder sb = new StringBuilder(a);

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.indexOf(b) != -1) {
            return count;
        }

        sb.append(a);
        if (sb.indexOf(b) != -1) {
            return ++count;
        }

        return -1;
    }
}
