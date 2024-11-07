class Solution
{
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String ar, dp; 
        
        ar = arriveAlice.compareTo(arriveBob) <= 0 ? arriveBob : arriveAlice;
        
        dp = leaveAlice.compareTo(leaveBob) <= 0 ? leaveAlice : leaveBob;
        
        int ret = 1;
        
        if(ar.compareTo(dp) > 0) 
            return 0;

        int amm = Integer.parseInt(ar.substring(0,2)), dmm = Integer.parseInt(dp.substring(0,2)), add = Integer.parseInt(ar.substring(3)), ddd = Integer.parseInt(dp.substring(3));
      
		
        for(int i = amm+1; i < dmm; i++)
            ret += days[i]; 
        
        if(amm == dmm) 
            ret += (ddd-add);
        
        else 
        {
            ret += days[amm]-add;
            ret += ddd;
        }
        
        return ret;
    }
}