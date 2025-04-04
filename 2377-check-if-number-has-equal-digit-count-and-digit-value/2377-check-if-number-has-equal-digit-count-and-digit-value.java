class Solution {
    public boolean digitCount(String num) {
        for(int i = 0; i < num.length(); i++) {
            int count = 0;
            for(int j = 0; j < num.length(); j++) {
                if(Character.getNumericValue(num.charAt(j)) == i) {
                    ++count;
                }
            }
            if(count != Character.getNumericValue(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
