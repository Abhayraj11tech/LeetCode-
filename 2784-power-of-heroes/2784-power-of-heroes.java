class Solution {
    public int sumOfPower(int[] nums) {
       ArrayList<Long >arr=new ArrayList<>();
            for(int i:nums)      
            {
                 arr.add((long)i);   
            }
            
            long  mod=1000000007;
            Collections.sort(arr);
            long mins=0;
            long sum=0;
            
            for(int i=0;i<arr.size();i++)
            {
                    sum=(sum+((arr.get(i)* arr.get(i))%mod)*arr.get(i)%mod)%mod;
                    sum=(sum+((mins*arr.get(i))%mod)*arr.get(i)%mod)%mod;
                    mins=(mins*2)%mod;
                    mins=(mins+arr.get(i))%mod;
            }
            int ans=(int)(sum%mod);
            return ans;
    }
}