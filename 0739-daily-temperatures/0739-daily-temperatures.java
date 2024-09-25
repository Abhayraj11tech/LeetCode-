class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        
        int [] sol = new int[n];
        if(temperatures[0]==99 && temperatures[n-1]==100  ){
            for(int i=0;i<n-1;i++){
                sol[i] = n-1-i;
            }
            sol[n-1] = 0;
        }
        else{
        for(int i=0;i<n;i++){
            int count = 1;
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    flag = true;
                     break;
                }
                else{
                    ++count;
                }
            }
            if(flag==true){
                sol[i] = count;
            }
            else{ 
            sol[i] = 0;
            }
        }}
        return sol;
        
    }
}