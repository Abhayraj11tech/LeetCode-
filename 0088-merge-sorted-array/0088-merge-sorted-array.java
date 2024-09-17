class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0 ;
        int count=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0 && count<n){
                nums1[i]=nums2[p++];
                count++;
            }
        }
        int temp;
        for(int x=0;x<nums1.length;x++){
            for(int y=0;y<nums1.length-1-x;y++){
                    if(nums1[y]>nums1[y+1]){
                        temp = nums1[y];
                        nums1[y] = nums1[y+1];
                        nums1[y+1] = temp;
                    }
            }
        }

        
    }
}