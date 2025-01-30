class Solution {
    public boolean divisorGame(int n) {
        boolean flag = true;
     int x = 1;
     int count = 0;
    while(n>=0){ 
        if(x>0 && x<n){ 
                if(n%x==0){
                    n = n-x;
                }
                
        
            ++count;
        }
        
        else{
            break;
        }
    }
    if(count%2!=0){
        return true;
    }
    else{
        return false;
    }
    }
}