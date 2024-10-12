class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] sol = new int[2];
        int a = 0;
        int b = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    ++a;
                    break;
                }
            }
        }
         for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                    ++b;
                    break;
                }
            }
        }
    
        sol[0] = a;
        sol[1] = b;
        return sol;
        


    }
}