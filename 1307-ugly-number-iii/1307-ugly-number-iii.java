class Solution {
    private long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }

    private long lcm(long a, long b){
        return a*b/gcd(a, b);
    }

    public int nthUglyNumber(int n, int a, int b, int c) {
        long low=0, high = Integer.MAX_VALUE;
        long ab = lcm(a, b), ac = lcm(a, c), bc = lcm(b, c), abc = lcm(a, bc);

        while(low<high){
            long mid = low + (high-low)/2;
            long count = mid/a + mid/b + mid/c - mid/ab - mid/bc - mid/ac + mid/abc;

            if(count<n){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        return (int)low;
    }
}