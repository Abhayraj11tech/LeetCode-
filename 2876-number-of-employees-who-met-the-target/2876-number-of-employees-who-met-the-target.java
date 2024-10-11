class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int count = 0;
        for(int i=hours.length-1;i>=0;i--){
            if(hours[i]>=target){
                ++count;
            }
            else{
                break;
            }
        }  
        return count; 
     }
}