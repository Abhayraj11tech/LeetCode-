class Solution {
    public int smallestEvenMultiple(int n) {
        int sol = -1;
        for(int i=2;i<=Integer.MAX_VALUE;i++){
            if(i%2==0 && i%n==0){
                sol = i;
                break;
            }
        }
        return sol;
    }
}