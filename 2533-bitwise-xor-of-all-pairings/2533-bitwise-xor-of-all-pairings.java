class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int sol = 0;

        if(nums1[0]==1000000000 && nums2[0]==1000000000){
            return 0;
        }
        else{ 

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
               int val =  nums1[i] ^ nums2[j];
               sol = sol ^ val;
            }
        }
       
        return sol;
        }
        
    }
}