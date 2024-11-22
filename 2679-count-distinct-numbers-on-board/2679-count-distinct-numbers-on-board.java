class Solution {
    public int distinctIntegers(int n) {
         Set<Integer> set = new HashSet<>();
        while( n>0)
        {
            for(int i=1; i<=n; i++)
            {
                if(n%i==1)
                {
                    set.add(i);
                }
            }
            n--;
        }
        return set.size()+1;
    }
}