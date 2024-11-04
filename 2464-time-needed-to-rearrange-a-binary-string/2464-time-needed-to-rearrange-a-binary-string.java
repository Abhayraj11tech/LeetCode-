class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count = 0;
        while (true) {
            String cmp = s.replaceAll("01", "10");
            if (cmp.equals(s)) {
                break;
            }
            s = cmp;
            count++;
        }
        return count;
    }

}