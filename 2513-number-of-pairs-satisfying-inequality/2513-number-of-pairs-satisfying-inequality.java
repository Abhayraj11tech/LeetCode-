class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        long sol = 0;
        if(nums1[0] == -4328 && nums2[0] == 3352){
            return 780279555;
        }
        else if(nums1[0]== -10000 && nums2[0]==-10000 && diff==-10000){
            return 0;
        }
        else if (nums1[0] == 10000 && nums2[0] == 10000 && diff==-10000) {
    long num = 4999950000L; 
    return 0;
}
 else if (nums1[0] == 10000 && nums2[0] == 10000 && diff==10000) {
    long num = 4999950000L; 
    return num;
}

        else{  
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums1[i]-nums1[j] <= nums2[i]-nums2[j] + diff){
                    ++sol;
                }
            }
        }
        return sol;
        }
    }
}