class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int len = l1+l2;
         
      int [] arr=new int [len];

      for(int i=0;i<len;i++){
            if(i <= (l1-1)){
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[i-l1];
            }
      }

      for(int x=0;x<len;x++){
        for(int y=0;y<len-x-1;y++){
            if(arr[y]>arr[y+1]){
                int temp = arr[y];
                arr[y] = arr[y+1];
                arr[y+1] = temp;
            }
        }
      }
            double sol;
      if(len % 2 !=0){
        sol = (double) arr[len/2];
        
      }
      else{
        sol = (double) arr[len/2 -1 ] + (double) arr[len/2];
        sol = sol/2;

      }

      return sol;
        
        
    }
}