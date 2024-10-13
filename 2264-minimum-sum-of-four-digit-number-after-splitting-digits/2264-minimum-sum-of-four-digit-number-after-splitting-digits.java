class Solution {
    public int minimumSum(int num) {
        String str = Integer.toString(num);
        String sol = "";
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '0'){ 
                sol += str.charAt(i);
            }
        }

        if(sol.length() == 1) {
            return Integer.parseInt(sol);
        }
        
        if(sol.length() == 2){
            int val1 = Integer.parseInt(sol.substring(0, 1));
            int val2 = Integer.parseInt(sol.substring(1, 2));
            return val1 + val2;
        }
        
        else if(sol.length() == 3){
            char[] digits = sol.toCharArray();
            Arrays.sort(digits);
            int val1 = Integer.parseInt(new String(new char[] {digits[0], digits[1]}));
            int val2 = Integer.parseInt(new String(new char[] {digits[2]}));
            return val1 + val2;
        }
        
        else {
            char[] digits = sol.toCharArray();
            Arrays.sort(digits);
            int val1 = Integer.parseInt(new String(new char[] {digits[0], digits[2]}));
            int val2 = Integer.parseInt(new String(new char[] {digits[1], digits[3]}));
            return val1 + val2;
        }
    }
}
