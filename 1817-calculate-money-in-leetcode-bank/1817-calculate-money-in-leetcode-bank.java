class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        
        if (n <= 7) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            int weeks = n / 7; 
            int extraDays = n % 7; 
            
            for (int i = 0; i < weeks; i++) {
                for (int j = 1; j <= 7; j++) {
                    sum += j + i;
                }
            }
            
            for (int i = 1; i <= extraDays; i++) {
                sum += weeks + i;
            }
        }
        
        return sum;
    }
}
