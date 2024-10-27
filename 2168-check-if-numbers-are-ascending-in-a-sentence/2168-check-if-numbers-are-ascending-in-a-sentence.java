class Solution {
    public boolean areNumbersAscending(String s) {
        int val = -1;
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                str.append(ch);
            } else if (str.length() > 0) {
                int num = Integer.parseInt(str.toString());
                if (num <= val) {
                    return false;
                }
                val = num;
                str.setLength(0);
            }
        }
        
        if (str.length() > 0) {
            int num = Integer.parseInt(str.toString());
            if (num <= val) {
                return false;
            }
        }
        
        return true;
    }
}
