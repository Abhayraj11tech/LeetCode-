class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        int cmp = 24;
        Arrays.sort(hours);
        for(int i=0;i<hours.length;i++){
           
             for(int j=i+1;j<hours.length;j++){
                if((hours[i]+hours[j])%24==0){
                    ++count;
                    
                }
            
            }
        }
        
        return count;
    }
}