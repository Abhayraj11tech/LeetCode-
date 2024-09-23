class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] sol = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    boolean flag = false;
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            sol[i] = nums2[k];
                            flag = true;
                            break;
                        }
                    }
                    if(flag==false){
                        sol[i] = -1;
                    }
                }
            }
        }
        return sol;
    }
}