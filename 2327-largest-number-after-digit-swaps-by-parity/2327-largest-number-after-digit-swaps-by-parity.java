class Solution {
    public int largestInteger(int num) {
        String s = Integer.toString(num);
        char[] sol = s.toCharArray();
        
        for (int i = 0; i < sol.length; i++) {
            int val1 = sol[i] - '0';
            for (int j = i + 1; j < sol.length; j++) {
                int val2 = sol[j] - '0';
                
                if (val1 % 2 == val2 % 2 && val2 > val1) {
                    char temp = sol[i];
                    sol[i] = sol[j];
                    sol[j] = temp;
                    val1 = sol[i] - '0';
                }
            }
        }
        
        return Integer.parseInt(new String(sol));
    }
}
