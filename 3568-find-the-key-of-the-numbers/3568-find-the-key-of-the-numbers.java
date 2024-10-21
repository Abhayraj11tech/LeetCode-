class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        String sol = "";
        
        for (int i = 0; i < 4; i++) {
            int val1 = Integer.parseInt("" + str1.charAt(i));
            int val2 = Integer.parseInt("" + str2.charAt(i));
            int val3 = Integer.parseInt("" + str3.charAt(i));
            
            int min = Math.min(val1, val2);
            min = Math.min(val3, min);
            sol += Integer.toString(min);
        }
        
        return Integer.parseInt(sol);
    }
}
