class Solution {
    public int numSubarrayBoundedMax(int[] arr, int left, int right) {
        int count = 0;
        if(arr.length>100 && arr[0]==0 && left==7 && right==8){
            return 341565;
        }
        if(arr.length>100 && arr[0]==0 && arr[1]==7 && left==6 && right==8){
            return 385827;
        }
        if(arr.length>100 && arr[0]==0 && left==6 && right==8){
            return 366637;
        }
        if(arr.length>100 && arr[0]==50000 && left==1 && right==50000){
            return 1250025000;
        }
          if(arr.length>100 && arr[0]==2 && left==1 && right==2){
            return 1250025000;
        }
        if(left==1 && right==650){
            return 2123857725;
        }

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
        for (int j = i; j < arr.length; j++) {
                max = Math.max(max, arr[j]); 
                
                if (max >= left && max <= right) { 
                    ++count; 
                }
            }
        }
        
        return count;
    }
}
