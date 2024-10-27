class Solution {
    public String largestGoodInteger(String num) {
        String max = "";
        for (int i = 0; i < num.length() - 2; i++) {
    
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                String triplet = num.substring(i, i + 3);
                if (triplet.compareTo(max) > 0) {
                    max = triplet;
                }
            }
        }
        return max;
    }
}
