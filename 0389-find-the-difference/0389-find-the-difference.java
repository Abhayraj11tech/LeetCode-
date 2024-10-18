class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        char sol = '\0';
        
        for (int i = 0; i < sb2.length(); i++) {
            if (sb1.indexOf(String.valueOf(sb2.charAt(i))) == -1) {
                sol = sb2.charAt(i);
                break;
            } else {
                sb1.deleteCharAt(sb1.indexOf(String.valueOf(sb2.charAt(i))));
            }
        }
        
        return sol;
    }
}
