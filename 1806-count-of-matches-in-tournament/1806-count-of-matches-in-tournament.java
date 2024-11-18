class Solution {
    public int numberOfMatches(int n) {
         int advance = 0;
        int matches = 0;
        int sum = 0;
        while(advance !=1)
        {
            if(n%2==0){
                matches = (int)(n/2);
                advance = n - matches;
            }
            else{
                matches  = (int)((n-1)/2);
                advance  = n - matches; 
            }
            n = advance;
            sum += matches;

        }
        return sum;
        // System.out.println(sum);
    }
}