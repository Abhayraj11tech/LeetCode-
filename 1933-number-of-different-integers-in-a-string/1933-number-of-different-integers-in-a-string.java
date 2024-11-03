class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> arr = new HashSet<>();
        StringBuilder number = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    String numStr = number.toString().replaceAll("^0+", "");
                    if (numStr.isEmpty()) {
                        numStr = "0";
                    }
                    arr.add(numStr);
                    number.setLength(0);
                }
            }
        }
        
        if (number.length() > 0) {
            String numStr = number.toString().replaceAll("^0+", "");
            if (numStr.isEmpty()) {
                numStr = "0";
            }
            arr.add(numStr);
        }
        
        return arr.size();
    }
}
