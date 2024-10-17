class Solution {
    public String maximumOddBinaryNumber(String s) {
        String sol = "";
        int idx = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                idx = i; 
                break;
            }
        }

        if (idx == -1){
            return sol;
        }

        sol = s.substring(0, idx) + s.substring(idx + 1);
        StringBuilder str = new StringBuilder(sol);
        
        int one = 0;
        int zero = 0;

        for (char ch : str.toString().toCharArray()) {
            if (ch == '1'){
                one++;
            }
            else{
                zero++;
            } 
        }

        str.setLength(0);
        for (int i = 0; i < one; i++) {
            str.append('1');
        }
        for (int i = 0; i < zero; i++) {
            str.append('0');
        }
        str.append('1');

        return str.toString();
    }
}
