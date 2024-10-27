class Solution {
    public int convertTime(String current, String correct) {
        int val = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3, 5));
        int time = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3, 5));
        
        int diff = time - val;
        int sol = 0;
        
        sol += diff / 60;
        diff %= 60;
        sol += diff / 15;
        diff %= 15;
        sol += diff / 5;
        diff %= 5;
        sol += diff;
        
        return sol;
    }
}
