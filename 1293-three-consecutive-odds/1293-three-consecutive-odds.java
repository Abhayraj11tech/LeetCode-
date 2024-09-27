class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if((i+2)<arr.length){
                if(arr[i]%2!=0){
                    ++count;
                    if(arr[i+1]%2!=0){
                        ++count;
                    }
                    if(arr[i+2]%2!=0){
                        ++count;
                    }
                }
            }
            if(count==3){
                flag = true;
                break;
            }
            else{
                count = 0;
            }
        }
        return flag;
    }
}